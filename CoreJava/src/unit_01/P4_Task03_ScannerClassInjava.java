package unit_01;
import java.util.Scanner;

/*
 * when user gives input from console
 * 
 * nextline()     Read Strings
 * next()         Read next token given as input
 * nextBoolean()  Read a boolean value from the user
 * nextByte()     Read a byte value from user
 * nextDouble()   Read a double value from user
 * nextInt()      Read a integer value
 * nextLong()     Read a long value 
 * nextShort()    Reads short value
 */
public class P4_Task03_ScannerClassInjava {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		String s1=obj1.nextLine();
		int val=obj1.nextInt();
		boolean b=obj1.nextBoolean();
		
		System.out.println(s1);
		System.out.println(val);
		System.out.println(b);
		
		obj1.close();

	}

}
