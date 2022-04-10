package unit_01;

public class P5_Task_02_MethodsInJava {

	public static void main(String[] args) {
		Abc2 obj=new Abc2();
		obj.display2();
		
	}

}
/*
 * Method defination
 * DataType name(DataType p1,DataType p2)
 * {
 * 		method body;
 * 		return value;
 * }
 */
class Abc2{
	int a=10;
	static int b=20;
	static void display() {
		int b=10;
		b++;
		System.out.println(b);
	}
	void display2()
	{
		System.out.println(a);
	}
}

