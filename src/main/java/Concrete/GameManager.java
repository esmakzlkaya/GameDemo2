package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	public void add(Game game) {
		System.out.println("Oyun kay�t edildi : "+game.getName());
		
	}

	public void delete(Game game) {
		System.out.println("Oyun silindi : "+game.getName());
		
	}

	
}
