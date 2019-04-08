package search;

public class binarySearch {

	public static void main(String[] args) {
		int a[] = {0,2,3,4,5,6,7,8,10};
		System.out.println(binarySerach(a,2));
	}
	public static int binarySerach(int []array, int a) {
		int lo = 0;
		int hi = array.length - 1;
		int mid;
		while(lo <= hi) {
			mid = (lo + hi)>>>1;
			if(array[mid] == a) {
				return mid+1;
			}else if(array[mid] < a) {
				lo = mid + 1;
			}else {
				hi = mid - 1;
			}
		}
		return -1;
		
	}

}
