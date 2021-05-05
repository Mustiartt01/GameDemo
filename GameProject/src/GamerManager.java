public class GamerManager implements GamerService {
	

	AuthService authService;
	
	public GamerManager(AuthService authService) {
		this.authService = authService;
	}
	
	public void add(Gamer gamer) {
		
		if (authService.auth(gamer) == true) {
			System.out.println("Kullan�c� Girisi Basar�l�...");
			
			System.out.println(gamer.getFirstName() +  " adl� kullan�c� eklendi...");
		}
		else {
			
			System.out.println("Hatal� Kullan�c�");
		}
		



	}
	
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() +  " adl� kullan�c� bilgileri g�ncellendi...");
	}

	public void delete(Gamer gamer) {
	
		System.out.println(gamer.getFirstName() +  " adl� kullan�c� silindi...");
	}
}
