package arrays;

import java.util.Scanner;

public class Array_1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // Step 1: Input values
        System.out.print("Enter the array length: ");
        int length = scr.nextInt();
        System.out.print("Enter the sum: ");
        int sum = scr.nextInt();

        // Step 2: Initialize array a
        int a[] = {1, 3, 5, 8};

        // Step 3: Create an instance of the example class
        example ex = new example();

        // Step 4: Call totalCount method and get the result
        int result = ex.totalCount(length, sum, a);

        // Step 5: Print the result
        System.out.println("The total count is: " + result);
    }
}

class example {

    // Make the totalCount method public to be accessible outside the class
    public int totalCount(int n, int sum, int a[]) {
        int count = 0;
        int i = 0, j = n - 1;
        
        // Process the array to count the pairs based on the sum
        while (i <= j) {
            if (a[i] + a[j] <= sum) {
                count += j-i+1;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
