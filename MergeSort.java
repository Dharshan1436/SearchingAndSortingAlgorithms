package searchingAndSortingAlgorithms;

public class MergeSort {

	public static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(a, l, mid);
			mergeSort(a, mid + 1, r);
			merge(a, l, mid, r);

		}

	}

	private static void merge(int[] a, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int[] la = new int[n1];
		int[] ra = new int[n2];
		for (int x = 0; x < n1; x++) {
			la[x] = a[l + x];
		}
		for (int x = 0; x < n2; x++) {
			ra[x] = a[mid + 1 + x];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (la[i] <= ra[j]) {
				a[k] = la[i];
				i++;
			}

			else {
				a[k] = ra[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = la[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = ra[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int a[] = { 3, 5, 4, 1, 6, 7, 0 };
		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
