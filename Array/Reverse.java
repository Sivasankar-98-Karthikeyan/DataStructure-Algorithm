import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the array size");
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        for(int i=0; i<arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original Array is ");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("The Reversed array is ");

        int start = 0, end = arraySize-1;
        int temp;
        for(int i=0; i<=arraySize/2-1; i++) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
