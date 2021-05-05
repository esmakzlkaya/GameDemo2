
import java.net.MalformedURLException;

import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		Gamer customer1=new Gamer();
		customer1.setId(1);
		customer1.setFirstName("Esma");
		customer1.setLastName("Kýzýlkaya");
		customer1.setBirthYear(1998);
		customer1.setNationalityId("Tckimlikno");
		
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.signUp(customer1);
	}

}
