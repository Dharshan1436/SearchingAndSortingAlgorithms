package searchingAndSortingAlgorithms;

public class Selectionsort {
	public static int[] selectionSort(int a[]) {
		int temp = 0;
		int index = -1;
		for (int i = 0; i < a.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[index] > a[j]) {
					index = j;
				}
			}
			temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 6, 3, 5, 2, 8, 4, 9 ,1,7};
		for (int c : a) {
			System.out.print(c + " ");
		}
		int b[] = selectionSort(a);
		System.out.println();
		for (int c : b) {
			System.out.print(c + " ");
		}
	}

}
