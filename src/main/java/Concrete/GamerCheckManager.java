package Concrete;

import java.net.MalformedURLException;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	private GamerCheckService gamerCheckService;
	
	public GamerCheckManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

	public void save(Gamer gamer) throws MalformedURLException {
		gamerCheckService.checkIfRealPerson(gamer);
		if(this.checkIfRealPerson(gamer)) {
			System.out.println("Saved to db : "+gamer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}
}
