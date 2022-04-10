package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String str) {
		 int i = 0, j = str.length() - 1;
		 
	        
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j))
	                System.out.println("string is not palindrome");
	           
	            i++;
	            j--;
	        }
	        System.out.println("string is palindrome");

	}

	void reverseOfAString(String input) {
		 char[] temparray = input.toCharArray();
	        int left, right = 0;
	        right = temparray.length - 1;
	 
	        for (left = 0; left < right; left++, right--) {
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right] = temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();

	}
	
	void stringEqualOrNot(String s1,String s2) {
		if(s1==s2) {
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	}
}