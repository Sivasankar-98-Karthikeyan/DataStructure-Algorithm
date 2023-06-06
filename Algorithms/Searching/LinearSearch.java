
public class LinearSearch {
	
	public static void main(String[] args) {
		
		int key = 30;
		int[] elements = {10,20,30,40,50};
		int resultIndex = linearSearch(elements, key);
		System.out.println("The Element found at the index " + resultIndex);
	}
	
	// Implementing Linear Search
	public static int linearSearch(int[] elements, int key) {
		for(int i=0; i<elements.length; i++) {
			if(elements[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
