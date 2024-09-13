package searchingAndSortingAlgorithms;

public class InsertionSort {

	public static int[] insertionSort(int a[]) {
		int key;
		int j;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;
			while ( j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}	

		return a;
	}

	public static void main(String[] args) {
		int a[] = { 6, 5, 3, 2, 1, 4, 9 };
		for(int k:a) {
			System.out.print(k+" ");
		}
		int b[] = insertionSort(a);
		System.out.println();
		for(int k:b) {
			System.out.print(k+" ");
		}
	}

}
