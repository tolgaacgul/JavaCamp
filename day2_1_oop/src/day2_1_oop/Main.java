package day2_1_oop;

public class Main {

	public static void main(String[] args) {			
			//verilerin hatalı tutumu
//			String[] products0 = {
//					"lenova",
//					"casper",
//					"apple"
//			};
//			
//			System.out.println("deneme surumudur.");
//			for(String product : products0) {
//				"System.out.println(product);
//			}
			//------------------------------------------------------------------
			Product product1 = new Product(334, "MacbookAir", 4200, "2015 çıkışlı(2016da alındı)"); //constractor sayesinde busekilde de tutulur
//			product1.detail = "Sıfır";
//			product1.id = 34;
//			product1.name = "apple";
//			product1.unitPrice = 2500;
			
			Product product2 = new Product();
			product2.detail = "ikinci el";
			product2.id = 323;
			product2.name = "Lenova";
			product2.unitPrice = 5833;
			
			Product product3 = new Product();
			product3.detail = "ikinci el";
			product3.id = 3413;
			product3.name = "Casper";
			product3.unitPrice = 5833;
			
			
			//verilerin dogru tutumu
			Product[] products = {product1,product2,product3};
			
			for(Product product : products) {
				System.out.println("--------Product--------");
				System.out.println("id: " + product.id);
				System.out.println("name: " + product.name);
				System.out.println("Price: " + product.unitPrice);
				System.out.println("detail : " + product.detail);
				System.out.println("-----------------------");
			};
			
			System.out.println("Nesneden gelen veri sayısı: " + products.length);
			
			
			//------------Category
			
			Category category1 = new Category();
			category1.id = 1;
			category1.name = "Dizüstü";
			
			Category category2 = new Category();
			category2.id = 2;
			category2.name = "Bahce/Hobi";
			
			Category[] categorys = {category1, category2};
			
			for(Category category : categorys) {
				System.out.println("--------Category--------");
				System.out.println(category.id);
				System.out.println(category.name);
				System.out.println("------------------------");
			}

			
			//--------------------Product Manager---------------------------------------------
			
			ProductManager productManager = new ProductManager();
			productManager.addToCart(product1);
			productManager.addToCart(product2);
			productManager.addToCart(product3);
	}

}
