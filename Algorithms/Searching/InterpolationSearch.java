
public class InterpolationSearch {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,7,9,11,13,15};
		int target = 11;
		
		int low = 0;
		int high = arr.length-1;
		int index = interpolationSearch(arr, low, high, target);

		if(index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element Found at index " +  index);
		}
	}
	
	public static int interpolationSearch(int arr[], int low, int high, int target) {
		
		int pos;
		if(low<=high && target>=arr[low] && target<=arr[high]) {
			
			pos = low+((target-arr[low])/(arr[high]-arr[low]))*(high-low);
			if(arr[pos] == target) {
				return pos;
			} else if(arr[pos] < target) {
				return interpolationSearch(arr, pos+1, high, target);
			} else if(arr[pos] > target) {
				return interpolationSearch(arr, pos, high-1, target);
			}
		}
		return -1;
	}

}
