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

	// public static int binarySearch(ArrayList<String> strList, String str) {
	// 	compare first letter of strings to see which half it's on??

	// }

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < 8; i++) {
			strList.set(i, null);
		}
		strList.set(0, "orange");
		strList.set(1, "apple");
		strList.set(2, "apple");
		strList.set(3, "acai");
		strList.set(4, "banana");
		strList.set(5, "watermelon");
		strList.set(6, "blueberry");
		strList.set(7, "strawberry");

		System.out.println(Searching(strList, "acai"));
	}
}