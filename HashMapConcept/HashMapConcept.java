package HashMapConcept;
import java.util.HashMap;
import java.util.Map;


public class HashMapConcept {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer>marks = new HashMap<String,Integer>();
		marks.put("James",1000);
		marks.put("tom",2548);
		marks.put("jonny",14789);
		marks.put("mack",200);
		
		System.out.println(marks.get("tom"));
		System.out.println(marks.get("mack"));
	
	}

}
