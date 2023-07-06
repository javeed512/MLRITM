package map;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
			String s1 = p1.toString();
			String s2 = p2.toString();
		
		return s1.compareTo(s2);
	}


}
