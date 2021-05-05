package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	public void add(Campaign campaign) {
		System.out.println("Oyun kayýt edildi : "+campaign.getName());
		
	}

	public void update(Campaign campaign) {
		System.out.println("Oyun güncellendi : "+campaign.getName());
		
	}

	public void delete(Campaign campaign) {
		System.out.println("Oyun silindi : "+campaign.getName());
		
	}

}
