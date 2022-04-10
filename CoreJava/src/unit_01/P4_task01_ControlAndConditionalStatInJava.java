package unit_01;
/*
 * Control and Conditional Statements:
 * --Java provides 3 types of control flow statements
 * ----Decision making 
 * ------if else
 * ------switch
 * 
 * ----Loops
 * ------do while loop
 * ------while loop
 * ------for loop
 * ------for each loop
 * 
 * ----Jump Statements
 * ------break
 * ------continue
 */
public class P4_task01_ControlAndConditionalStatInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		obj.DecisionMaking();
		obj.jumps();
		obj.Loops();
		
	}

}
class Statements{
	void DecisionMaking() {
		int x=10;
		int y=20;
		if(x+y<10) {
			System.out.println("x+y is less than 10");
		}
		else
		{
			System.out.println("x+y is greater than 10");
		}
		int c=2;
		switch(c) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("err");
		}
	}
	void Loops() {
		//for loop
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of first 10 numbers is:"+sum);
		
		//for each
		String[] listofwords= {"hey","hello","hi","world"};
		for(String word:listofwords)
		{
			System.out.println(word);
		}
		//while loop
		int z=10;
		while(z!=0)
		{
			System.out.println(z);
			z-=1;
		}
		
		//do while loop
		int number=5;
		do {
			System.out.println(number);
			number-=1;
		}
		while(number>0);
	}
	void jumps()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(i==6)
				break;
			System.out.println(i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==6)
				continue;
			System.out.println(i);
		}
	}
}
