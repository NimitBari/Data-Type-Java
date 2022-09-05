package HashMapConcept1;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
TreeMap<Integer,String>map = new TreeMap<>();
map.put(1000,"Nimit");
map.put(1144444,"Sahil");
map.put(254100,"Smit");
map.put(20,"Shreyash");
System.out.println(map);

System.out.println(map.lastKey());
System.out.println(map.firstKey());

Set<Integer>keylessthan3k = map.headMap(300).keySet();
System.out.println(keylessthan3k);

Set<Integer>keylessgrthan4k = map.tailMap(3003).keySet();
System.out.println(keylessgrthan4k);
	}

}
