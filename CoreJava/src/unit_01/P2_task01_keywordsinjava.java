package unit_01;

public class P2_task01_keywordsinjava {

	public static void main(String[] args) {
		//Syntax error on token "double", invalid VariableDeclaratorId
		//we cannot use double as variable name
		int double=10;
		
		//we cannot make object same as keywords
		display int = new display();
		
		//calling the right name
		display obj=new display();
		obj.disp();

	}

}
class display
{
	void disp() {
		System.out.println("in the class");
	}
}
//we cannot put class name as a keyword name as int is a keyword
class int{
	void err()
	{
		System.out.println("error!");
	}
	
}
