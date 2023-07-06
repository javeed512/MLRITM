package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		// Map<Integer,String> map = new LinkedHashMap<Integer,String>();

//Map<Integer,String> map  =	new TreeMap<Integer,String>();

		map.put(113, "Scott");
		map.put(112, "Adam");
		map.put(114, "Ford");
		map.put(111, "Tom");
		map.put(112, "Javeed");
		map.put(56, "Ford");
		System.out.println(map);

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			Integer key = it.next();

			System.out.println(key + " " + map.get(key));

		}

	}

}
