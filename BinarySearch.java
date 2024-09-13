package searchingAndSortingAlgorithms;

public class BinarySearch {
public static int binarySearch(int a[],int key) {
	int l=0;int h=a.length;int mid=0;
	while(l<=h) {
		mid=(l+h)/2;
		if(key==a[mid]) {
			return mid;
		}else if( key >a[mid] ) {
			l=mid+1;
		}else {
			h=mid-1;
			
		}
	}
	return -1;
	
}
	public static void main(String[] args) {
		int a[]= {2,3,4,8,12,15,25,36};
		int key=36;
		System.out.println(binarySearch(a, key));
	}

}
