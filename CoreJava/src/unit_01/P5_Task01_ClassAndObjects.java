package unit_01;

public class P5_Task01_ClassAndObjects {

	public static void main(String[] args) {
		Abc obj=new Abc();
		Abc.display();
		obj.display2();
		
	}

}
class Abc{
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
