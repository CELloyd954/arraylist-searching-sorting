import java.util.*;
public class Search {
	
	public static int Searching(ArrayList<String> strList, String str) {
		int found = 0;
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i).equals(str)) {
				found = i;
			}
		}
		return found;
	}

	//public static int binarySearch(ArrayList<String> strList, String str) {
	// 	compare first letter of strings to see which half it's on??

	// }

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("orange");
		strList.add("apple");
		strList.add("apple");
		strList.add("acai");
		strList.add("banana");
		strList.add("watermelon");
		strList.add("blueberry");
		strList.add("strawberry");

		System.out.println(Searching(strList, "acai"));
	}
}