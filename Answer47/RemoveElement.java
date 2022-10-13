package Answer47;

import java.util.LinkedList;

public class RemoveElement {

	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();

		languages.add("java");
		languages.add("python");
		languages.add("Javascript");
		languages.add("Kotlin");
		System.out.println("LinkedList: " + languages);
		
		String str = languages.remove(3);
		System.out.println("Removed Element: " + str);
		
		System.out.println("Updated LinkedList: " + languages);
	}

}
