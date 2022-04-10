package unit_01;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		Scanner sc=new Scanner(System.in);
		LocalDate current_date = LocalDate.now();
		System.out.println("1.to print current year\n2.to print current month\n3.to print current day");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			int year=current_date.getYear();
			System.out.println("current year is "+year);
			break;
		
		case 2:
			Month month=current_date.getMonth();
			System.out.println("current month is "+month);
			break;
		case 3:
			int day=current_date.getDayOfMonth();
			System.out.println("day is "+day);
			break;
		default:
			System.out.println("invalid input");
	  }
	 	sc.close();
		
		
		
	}
}