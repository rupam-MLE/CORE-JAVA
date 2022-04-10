package unit_01;
/*
 * 3 ways
 * StringBuffer()
 * StringBuffer(String str)
 * StringBuffer(int capacity)
 */
public class P6_Task03_StringBufferInJava {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" Java"); //append method of string buffer
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		
		//insert() method
		sb.insert(0,"GEHU");
		System.out.println(sb);
		
		//replace method
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.replace(1,3,"java");
		System.out.println(sb2);
		
		//delete() method
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.delete(1,2);
		System.out.println(sb3);
		
		
		

	}

}
