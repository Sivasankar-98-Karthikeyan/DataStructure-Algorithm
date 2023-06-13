
public class MetaBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int length = arr.length;
		int key = 40;
		int interval = length;
		
		while(interval>0) {
			int index = Math.min(length-1, interval/2);
			int midElement = arr[index];
			if(midElement == key) {
				System.out.println(index);
			} else if(midElement < key) {
				interval = (length-index)/2;
			} else {
				interval = index/2;
			}
		}
		

	}

}
