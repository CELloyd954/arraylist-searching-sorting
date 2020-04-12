import java.util.*;
public class Sort {

	public static void selectionSort(ArrayList<String> list) {
		String smallest = "z";
		int low = 0;
		int place = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int k = i; k < list.size(); k++) {
				if (list.get(k).compareTo(smallest) < low) {
					low = list.get(k).compareTo(smallest);
					smallest = list.get(k);
					place = k;
				}
			}
			String str = list.get(i);
			list.set(i, list.get(place));
			list.set(place, str);
			smallest = "z";
			low = 0;
			place = 0;
		}
	}

	public static void insertionSort(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int k = i + 1; k > 0; k--) {
				if (list.get(k).compareTo(list.get(k - 1)) < 0) {
					String str = list.get(k- 1);
					list.set(k - 1, list.get(k));
					list.set(k, str);
				}
			}
		}
	}

	public static void bubbleSort(ArrayList<String> list) {
		boolean sorted = false;
		int count = 0;
		while (count < list.size()) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i + 1).compareTo(list.get(i)) < 0) {
					String str = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, str);
				}
			}
			for (int k = 0; k < list.size() - 1; k++) {
				if (list.get(k + 1).compareTo(list.get(k)) >= 0) {
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("orange");
		strList.add("pomegranate");
		strList.add("apple");
		strList.add("acai");
		strList.add("banana");
		strList.add("watermelon");
		strList.add("blueberry");
		strList.add("strawberry");

		selectionSort(strList);
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}