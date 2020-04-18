
import java.util.Scanner;

public class PalindromeRecursion {
	
	 public static boolean isPalindrome(String s) { 
		 
		 // if length is 0 or 1 then the String is palindrome
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	        /* check for first and last char of String:
	         * if the first and last characters are same then do the same thing for a substring
	         * with first and last char removed.
	         */
	        return isPalindrome(s.substring(1, s.length()-1)); //recursion: calling the method itself
	        

	        //return false if it is not palindrome
	        
	        return false;
	    }//end isPalindrome

	public static void main(String[] args) {
		
		//Ask users to enter a string 
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = scan.next();
		
		if(isPalindrome(str) == true) {
			
        	System.out.println("Received \"" + str + "\" " + "Which is indeed a palindrome" );

		}else {
        	System.out.println("Received \"" + str + "\" " + "Which is not a palindrome" );

		}//end if-else

	}//end main method

}//end class
