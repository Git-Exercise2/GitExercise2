package sort;

import java.util.Arrays;

public class SortingIntegers {

      	// Sort 
	    public static void Sort(int[] arr) {
	    	int min;
			int temp = 0;
			
			for(int i = 0 ; i < arr.length; i++) {
				
				min = arr[i];
				
				for (int j = i; j < arr.length; j++) {
					
					if (min > arr[j]) {
						min = arr[j];
						
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
	            }
	        }
	    }
    }
	    
	    // Example
	    public static void main(String[] args) {
	        int[] numbers = {87, 12, 25, 45, 22, 56, 96};

	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array 
	        Sort(numbers);

	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
}