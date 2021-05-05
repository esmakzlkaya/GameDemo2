package Abstract;

import java.net.MalformedURLException;

import Entities.Gamer;

public interface GamerService {

	public void signUp(Gamer gamer) throws MalformedURLException;
	public void updateProfile(Gamer gamer);
	public void deleteProfile(Gamer gamer);
}
