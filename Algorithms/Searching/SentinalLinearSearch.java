
public class SentinalLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		for(int i = 0; i<=5; i++) {
			arr[i] = i;
		}
		arr[9] = 20;
		int n = arr.length;
		
		System.out.println(arr.length);
		int last = arr[arr.length-1];
		int key = 20;
		arr[arr.length-1] = key;
		
		int i = 0;
		while(arr[i] != key) {
			System.out.println(i);
			i++;
		}
		arr[arr.length-1] = last;
		if(i < n-1 || arr[n-1] == key) {
			System.out.println("Element Found at index " + i);
		} else {
			System.out.println("Element Not Found");
		}
		
		
	}

}
