
public class OrderManager implements OrderService {

	

	public void orderDetail(Game game,Gamer gamer,Champaign champaign) {
		
		double sonFiyat = game.getPrice() - (game.getPrice() * champaign.getDiscount()/100) ;
		
		
		System.out.println("Sipari� No: 1");
		System.out.println("Sat�n Alan: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Oyun: " + game.getGameName());
		System.out.println("�ndirimsiz Fiyat: " + game.getPrice());
		System.out.println("�ndirim Ad�: " + champaign.getChampaignName());
		System.out.println("�ndirim Oran�: " +"%"+ champaign.getDiscount());
		System.out.println("�ndirimli Fiyat: " + sonFiyat);
		
	}

}
