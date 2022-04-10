package unit_01;
/*Array is a collection of similar type of elements which has contiguous memory location
 * Java array is an object which contain elements of similar type
 * --Limitations of arrays:
 * 		we can store only fixed size of elements in array
 * 		it cannot grow its size at runtime
 * 		To solve this problem we have collection framework in java which grows its size automatically
 * --There are two types of array
 * 		Single dimensional array
 * 		multi dimensional array
 * --Declaration of array in java
 * 		DataType varname[];
 * 		DataType[] varname;
 * 		DataType []varname;
 * --Instantiation of an array in java
 * 		varname=new datatype[size];
 
 */
public class P6_Task01_ArrayInJava {

	public static void main(String[] args) {
		//Declaration
		int arr1[];
		//Instantiation
		arr1=new int[10];
		
		for(int i=0;i<arr1.length;i++)
				arr1[i]=i;
		
		//Declaration, Instantiation, init
		int arr2[]= {1,2,3,4,5};
		
		//Passing array to method
		arrayasparam(arr2);
		
		//Passing anonymous array to method
		arrayasparam(new int[] {33,4,5,6});
		
		//multi dimensional array
		int arr3[][];
		arr3=new int[2][3];
		
		
		
	

	}
	static void arrayasparam(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
	static int[] arrayasreturn() {
		
		int []arr4= {1,2,3,4,5};
		return arr4;
		
	}

}
