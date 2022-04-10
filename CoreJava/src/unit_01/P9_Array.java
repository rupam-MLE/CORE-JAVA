package unit_01;

import java.util.Arrays;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

	void findTheDuplicateElements(int[] arr) {
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]); 
                }
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	void leftRotationInAnArray(int[] arr) {
		int n=1;
		 System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	               
	                arr[j] = arr[j+1];  
	            }  
	            
	            arr[j] = first;  
	        }  
	        System.out.println();  
	          
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");
	        }

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
