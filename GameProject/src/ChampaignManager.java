public class ChampaignManager implements ChampaignService{



	public void add(Champaign champaign) {
		
		System.out.println(champaign.getChampaignName() +  " adl� kampanya eklendi...");
	}
	
	public void update(Champaign champaign) {
		
		System.out.println(champaign.getChampaignName() +  " adl� kampanya g�ncellendi...");
	}

	public void delete(Champaign champaign) {
	
	System.out.println(champaign.getChampaignName() +  " adl� kampanya silindi...");
	}
	
}
