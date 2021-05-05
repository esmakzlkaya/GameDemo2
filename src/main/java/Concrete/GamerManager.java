package Concrete;

import java.net.MalformedURLException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	public void signUp(Gamer gamer) throws MalformedURLException {
		gamerCheckService.checkIfRealPerson(gamer);
		if(this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kullanýcý kayýt edildi : "+gamer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}

	public void updateProfile(Gamer gamer) {
		System.out.println("Kullanýcý güncellendi : "+gamer.getFirstName());
		
	}

	public void deleteProfile(Gamer gamer) {
		System.out.println("Kullanýcý silindi : "+gamer.getFirstName());
		
	}

}
