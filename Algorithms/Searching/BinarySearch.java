
public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int key = 20;
		
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		
		
		int index = iterativeMethod(arr, key);
		if(index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element found at index "+ index);
		}
		
		// Calls Recursive Method
		int index2 = recursiveMethod(arr, firstIndex, lastIndex, key);
		
		System.out.println("Recursive Method");
		if(index2 == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element found at index "+ index2);
		}
		
	}
	
	// Binary Search Using Iterative Method
	public static int iterativeMethod(int[] arr, int key) {
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		
		while(firstIndex <= lastIndex) {
			int midIndex = firstIndex + (lastIndex-firstIndex)/2;
			if(arr[midIndex] == key) {
				return midIndex;
			} else if(arr[midIndex] > key) {
				lastIndex = midIndex - 1;
			} else{
				firstIndex = midIndex + 1;
			}
		}
		return -1;
	}
	
	// Binary Search Using Recursive Method
	public static int recursiveMethod(int[] arr, int firstIndex, int lastIndex, int key) {
		
		int midIndex = firstIndex + (lastIndex - firstIndex)/2;
		if(firstIndex<=lastIndex) {
			if(arr[midIndex] == key) {
				return midIndex;
			} else if(arr[midIndex] > key) {
				return recursiveMethod(arr, firstIndex, midIndex-1, key);
			} else if(arr[midIndex] < key) {
				return recursiveMethod(arr, midIndex+1, lastIndex, key);
			}
		}
		return -1;
	}

}
