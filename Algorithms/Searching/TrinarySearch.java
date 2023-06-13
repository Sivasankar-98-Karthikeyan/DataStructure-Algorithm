
public class TrinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;
		
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		
		// Call Iterative Method to solve trinary search
		int index = iterativeMethod(arr, target, firstIndex, lastIndex);
		if(index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element Found at index "+ index);
		}
		
		//call Recursive Method to solve Tirnary Search
		int index2 = recursiveMethod(arr, target, firstIndex, lastIndex);
		if(index2 == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element Found at index "+ index2);
		}
	}
	
	// Method to find the target using the iterative method
	public static int iterativeMethod(int[] arr, int target, int firstIndex, int lastIndex) {
		while(firstIndex<=lastIndex) {
			int mid1 = firstIndex+(lastIndex-firstIndex)/2;
			int mid2 = lastIndex-(lastIndex-firstIndex)/2;
			if(arr[mid1] == target) {
				return mid1;
			} else if(arr[mid2] == target) {
				return mid2;
			} else if(arr[mid1] > target) {
				lastIndex = mid1-1;
			} else if(arr[mid2] < target) {
				firstIndex = mid2+1;
			} else {
				firstIndex = mid1+1;
				lastIndex = mid2-1;
			}
		}
		return -1;
	}
	
	//Method to find the target using the recursive method
	public static int recursiveMethod(int[] arr, int target, int firstIndex, int lastIndex) {
		while(firstIndex<=lastIndex) {
			int mid1 = firstIndex+(lastIndex-firstIndex)/2;
			int mid2 = lastIndex-(lastIndex-firstIndex)/2;
			if(arr[mid1] == target) {
				return mid1;
			} else if(arr[mid2] == target) {
				return mid2;
			} else if(arr[mid1] > target) {
				return recursiveMethod(arr, target, firstIndex, mid1-1);
			} else if(arr[mid2] < target) {
				return recursiveMethod(arr, target, mid2+1, lastIndex);
			} else {
				return recursiveMethod(arr, target, mid1+1, mid2-1);
			}
		}
		return -1;
	}
	

}
