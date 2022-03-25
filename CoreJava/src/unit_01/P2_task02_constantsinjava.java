package unit_01;

public class P2_task02_constantsinjava {
	//declaration of a constant 
	public final double pi=3.14;

	public static void main(String[] args) {
		//tried to change value 
		pi=10.00;
		alu obj1=new alu();
		obj1.add();
		
	}

}
class alu{
	P2_task02_constantsinjava obj2=new P2_task02_constantsinjava();
	void add()
	{
		int sum=10+5;
		System.out.println(sum+(obj2.pi));
	}
	
}
