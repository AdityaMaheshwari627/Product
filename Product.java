package Arrays;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
     // Arrays to store the product of elements to the left and right
        long[] leftProducts = new long[n];
        long[] rightProducts = new long[n];

        // Initialize the leftProducts array
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * arr[i - 1];
        }

        // Initialize the rightProducts array
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * arr[i + 1];
        }

        // Calculate the product of all elements except itself
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        // Output the result
        System.out.println("Product of array except itself for each element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
	}

}
