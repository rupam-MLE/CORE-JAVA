package unit_01;
/*
 * Constructor is a spl function which get called when instance of class is created
 * At the time when constructor is called memory is allocated for the object
 * Two types of constructors in java
 * 	-Parameterized constructor
 * 	-Default constructor
 */
public class p5_Task02_ConstructorsInjava {

	public static void main(String[] args) {
		ABC3 obj=new ABC3();
		ABC3 obj1=new ABC3(5);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		
	}

}
class ABC3 {
	int a;
	//default
	ABC3(){
		a=10;
	}
	//constructor has same name as class
	ABC3(int a)
	{
		this.a=a;
	}
	
}