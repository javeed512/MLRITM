package map;

import java.util.Map;
import java.util.TreeMap;

public class ProductMap {

	public static void main(String[] args) {

Map<Product, String> productMap =
		new TreeMap<Product, String>(new ProductComparator());

		Product p1 = new Product(101, "Laptop", 50000);
		Product p2 = new Product(102, "Mobile", 20000);
		Product p3 = new Product(103, "Charger", 500);
		Product p4 = new Product(104, "PowerBank", 3000);

		productMap.put(p1, "Dell Laptop with Windows 11");
		productMap.put(p2, "IPhone Mobile with 20GB RAM");
		productMap.put(p3, "Nokia Ultra fast Charger");
		productMap.put(p4, "Redmi PowerBank 3000mh");

		
			System.out.println(productMap);
	}

}
