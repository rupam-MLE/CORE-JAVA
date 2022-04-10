package unit_01;
/*
 * variable in java is a data container that saves the data values during java program execution.
 * types of var in java:
 * 	local variables:declared inside the body of the method
 * 	Instance variable: Instance variable are defined without the static keyword
 * 		-they are defined outside a method declaration 
 * 		-they are object specific and are known as instance variable
 * static variables:
 * 		-static variables are defned with the static keyword
 * 		-static variables are initialized only once at the start of program execution
 * 		-these static variables should be initialized first before the initialization of any variable
 */

public class P3_task01_variablesanddatatypesinjava {

	public static void main(String[] args) {
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//initialization:
		pi=3.14f; //floating point number
		d=20.22d;
		e='v'; //character
		a=10;
		b=10; //integer
		c=10;
		
		System.out.println(a);
		System.out.println(pi);
		System.out.println(e);
		System.out.println(a);
		
		
		boolean mybool=true;//boolean
		String s1="hello i am rupam";//string 
		
		System.out.println(mybool);
		System.out.println(s1);
		
		
		//type conversion:
		double f;
		int i=10;
		f=i;
		
		//type casting
		double g=10;
		int j;
		j=(int)g;
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		

	}

}
