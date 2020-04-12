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

	public static int binarySearch(ArrayList<String> strList, String str) {
	// 	compare first letter of strings to see which half it's on??
		int i = -1;
		int end = strList.size() - 1;
		int start = 0;
		while (start < end && i == -1) {
			int mid = (start + end) / 2;

			if (strList.get(mid).equals(str)) {
				i = mid;
			} else if (str.compareTo(strList.get(mid)) > 0) {
				start = mid;
			} else {
				end = mid;
			}

			if (end - start <= 1) {
				if (end == strList.size() - 1) {
					i = strList.size() - 1;
				}
			} else {
				if (strList.get(0).equals(str)) {
					i = 0;
				}
			}
			end = start;
		}
		return i;
	}

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

		// System.out.println(Searching(strList, "acai"));
		System.out.println(binarySearch(strList, "acai"));
	}
}