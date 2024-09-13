package searchingAndSortingAlgorithms;

public class QuickSort {
	public static void quickSort(int[] a, int low, int high) {
		if (low < high) { // Corrected condition: high > low -> low < high
			int pi = partition(a, low, high);
			quickSort(a, low, pi - 1);
			quickSort(a, pi + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] < pivot) { // Corrected condition: for ascending order
				i++;
				// Swap a[i] and a[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		// Swap pivot with the element at a[i+1]
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 8, 5, 2, 1, 4, 7 };
		
		quickSort(a, 0, a.length - 1);
		
		// Print sorted array
		for (int k : a) {
			System.out.print(k + " ");
		}
	}
}
