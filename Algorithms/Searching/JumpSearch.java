
public class JumpSearch {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int key = 10;
		
		int n = arr.length;
		int m = (int) Math.floor(Math.sqrt(n));
		int firstIndex = 0;
		
		for(int midIndex = Math.min(m, n)-1; arr[midIndex]<key; midIndex = Math.min(m, n)-1) {
			firstIndex = m;
			m += (int) Math.floor(Math.sqrt(n));
			if(firstIndex >= n) {
				System.out.println("Element Not Found");
			}
		}
		
		for(int i = firstIndex; firstIndex<=m; i++) {
			if(arr[i] == key) {
				System.out.println("Element found at index " +  i);
			}
		}

	}

}
