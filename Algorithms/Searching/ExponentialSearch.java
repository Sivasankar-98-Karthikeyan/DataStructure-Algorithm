import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 9;
		
		int index = exponentialSearch(arr, target);
		
		if(index == -1) {
			System.out.println("Element Not Found");	
		} else {
			System.out.println("Element Found at index "+  index);
		}
	}
	
	
	public static int exponentialSearch(int arr[], int target) {
		
		if(arr[0] == target) {
			return 0;
		}
		
		int i=1;
		while(i<arr.length && arr[i] <= target) {
			i*=2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i, arr.length-1), target);
	}
}
