package day06;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop(); // 인터페이스 shop = 구현 클래스
		shop.setTitle("MyShop");
		shop.genProduct();
		shop.genUser();
		shop.start();
	}

}
