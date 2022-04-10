package unit_01;

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {
		StringInJava obj=new StringInJava();
		obj.StringDef();
		obj.charAndString();
		

	}

}
class StringInJava{
	void StringDef()
	{
		String s="Hello world";
		String s1;
		s1=new String("HEY");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1.length());
		
		//loop through a string
		for (int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		String first="Java";
		String second="Coder";
		
		//Add two strings
		String third=first+second;
		System.out.println(third);
		
		//compare two strings
		boolean result=first.equals(second);
		System.out.println(result);
		
		/*
		 * String in Java are Immutable
		 * JVM maintains a string pool to store all the strings used in a system
		 * This reduce the memory usage
		 * 		If string is already in the string pool then the new string is not created
		 * 		instead of this a new reference of it will be created
		 * 		if string is not in the pool then new string is created in the pool
		 * 
		 */
		String fourth="strings";
		String fifth=new String("new string");//we tell compiler to make new String even if string is available in pool
		
		
		
		
	}
	//Character array in java are mutable
	void charAndString() {
		char[] c1= {'a','b','c'};
		System.out.println(c1);
		
		//we can make a string out of character array
		String s1=new String(c1);
		System.out.println(s1);
		
		//we can make char array of string
		String s2="Automata";
		char[] c2=s2.toCharArray();
		System.out.println(c2);
		
	}
}
