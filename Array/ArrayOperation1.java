import java.util.Scanner;

public class ArrayOperation1 {
	
	public static int findSmallest(int arr[], int size) {
		int temp = arr[0];
		for(int i=1; i<size; i++) {
			if(temp > arr[i])
				temp = arr[i];
		}
		return temp;
	}
	
	public static void performOperation(int arr[], int size, int num) {
		for(int i=0; i<size; i++) {
			arr[i] = (arr[i]-num)*num;
		}
		display(arr);
	}
	
	public static void display(int arr[]) {
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = findSmallest(arr, size);
		performOperation(arr, size, smallest);
		sc.close();
	}	
}
