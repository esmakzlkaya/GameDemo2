package Abstract;

import java.net.MalformedURLException;

import Entities.Gamer;

public interface GamerCheckService {

	public boolean checkIfRealPerson(Gamer gamer) throws MalformedURLException;
}
