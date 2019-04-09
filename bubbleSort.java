package search;

public class bubbleSort {

	public static void main(String[] args) {
		int[] array = {9,4,69,34,2,4,7,4,0};
		bubblesort(array);
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	/*
	 * Ã°ÅÝÅÅÐò
	 * Ê±¼ä£º2019/4/9
	 * 
	 */
	public static void bubblesort(int[] array ) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length-i; j++) {
				if(array[j-1] > array[j]) {
					int temp;
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
