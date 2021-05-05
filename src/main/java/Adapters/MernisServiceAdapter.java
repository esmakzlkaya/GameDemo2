package Adapters;

import java.net.MalformedURLException;
import java.net.URL;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws MalformedURLException {
		String endpoint= "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		URL url=java.net.URI.create(endpoint).toURL();
		
		KPSPublic service= new KPSPublic(url);
		KPSPublicSoap port=service.getPort(KPSPublicSoap.class);
		return port.tcKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getBirthYear());
	}

	

}
