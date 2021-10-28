package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iphone13",1000000);
		phone.setDescription("4.7-inch, 1334x750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacture("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
	
		
		Product notebook = new Product("P1235","LG PC GRAM", 2000000);
		notebook.setDescription("13-3inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacture("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab s", 900000);
		tablet.setDescription("212.8*125.6*6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacture("SamSung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);		
		
	} // 생성자 
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	
	
	
}
