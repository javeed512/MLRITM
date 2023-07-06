package map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {


	Map<Integer,String> map = new Hashtable<Integer,String>();
		
				map.put(1, "King");
				map.put(2, "Tom");
				map.put(4, "Smith");
				map.put(11, "Raju");
				map.put(21, "Khan");
				map.put(50 , "King");
				
				System.out.println(map);

	}

}
