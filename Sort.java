import java.util.*;
public class Sort {

	public static void selectionSort(ArrayList<String> list) {
		String smallest = "z";
		int low = 0;
		int place = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int k = i; k < list.size(); k++) {
				if (list.get(k).compareTo(smallest) < low) {
					smallest = list.get(k);
					place = k;
					low = list.get(k).compareTo(smallest);
				}
			}
			list.set(i, smallest);
			list.set(place, list.get(i));
		}
	}

	public static void insertionSort(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int k = i + 1; k > 0; k--) {
				if (list.get(k).compareTo(list.get(k - 1)) < 0) {
					list.set(k - 1, list.get(k));
					list.set(k, list.get(k - 1));
				}
			}
		}
	}

	public static void bubbleSort(ArrayList<String> list) {
		boolean sorted = false;
		int count = 0;
		while (!sorted) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i + 1).compareTo(list.get(i)) < 0) {
					list.set(i, list.get(i + 1));
					list.set(i + 1, list.get(i));
				}
			}
			for (int k = 0; k < list.size() - 1; k++) {
				if (list.get(k + 1).compareTo(list.get(k)) > 0) {
					count++;
				} 
			}
			if (count = list.size() - 1) {
				sorted = true;
			}
		}
	}

	public static void main(String[] args) {
		
	}
}