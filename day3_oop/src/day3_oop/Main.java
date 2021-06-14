package day3_oop;

public class Main {

	public static void main(String[] args) {

		// Bu tür ifadelerin kullanımı kontrolu bozar. erişim kısıtlanmaz
		//kullanılması için Product alanındaki fieldların privite'dan çıkması lazım
		
//		Product product1 = new Product();
//		product1.id = 2;
//		product1.name = "phlips Computer";
		
		
		
		//-----------------Product---------------------
		Product product2 = new Product(0,"Macbook",2000, 10);
		
		Product product3 = new Product();
		product3.setId(2);
		product3.setName("MacBook Air");
		product3.setUnitPrice(1000);		
		product3.setDiscount(20);
		
		Product product4 = new Product();
		product4.setId(4);
		product4.setName("ASUS ZenBook");
		product4.setUnitPrice(3000);
		product4.setDiscount(25);
		
		Product product5 = new Product();
		product5.setId(5);
		product5.setName("HP 2021");
		product5.setUnitPrice(5000);
		product5.setDiscount(30);
		
		Product[] products = {product2,product3,product4,product5};
		
		System.out.println("-/-/-/-/-Urunlerin Listesi-/-/-/-/-");
		for(Product product : products) {
			System.out.println("---------Product " + product.getId() + "-----------");
			System.out.println(product.getName());
			System.out.println("Fiyat: " + product.getUnitPrice());	
			System.out.println("indirim Oranı: %" + product.getDiscount());
			System.out.println("indirimli fiyat: " + product.getUnitPriceAfterDiscount());
		}
		
		
		//--------------ProductManager-------------------
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product3);
		
		
		
		//------------------Category------------------- 
		Category category1 = new Category();
		Category category2 = new Category();
		
		//Bu şekilde atamalar yok artık
//		category1.id = 1;
//		category1.name = "bilgisyarlar";
		category1.setId(1);
		category1.setName("Bigisyar");
		
		category2.setId(2);
		category2.setName("Bahçe & Çiçek");
		
		Category[] categorys = {category1,category2};
		for(Category category : categorys) {
			System.out.println("---------Category-----------");
			System.out.println(category.getId() + ". " + category.getName());
		}

		

		
		
	}

}
