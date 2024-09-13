package searchingAndSortingAlgorithms;

public class BubleSort {
	public static int[] bubleSort(int a[]) {
		int temp = 0;

		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 5, 4, 1, 8, 0,9 };
		for(int k:a) {
        	System.out.print(k+" ");
        }
		int b[] = bubleSort(a);
		System.out.println();
        for(int k:b) {
        	System.out.print(k+" ");
        }
	}

}
