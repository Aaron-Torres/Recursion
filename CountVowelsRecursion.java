public class CountVowelsRecursion {
	
		//Method to check and replace the vowel to upper case letters returns true if it is a vowel
		static int isVowel(char vowel) {
			
			vowel = Character.toUpperCase(vowel);//replace the character in the string to uppercase
			
			if( vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
				return 1;
			}
			
			return 0;
			
		}//end isVowel
		
		//method to find and count how many vowels in the string
		static  int countVowels(String string, int n) {
			//int count = 0; //counter
			
			if(n == 1) {
				return isVowel(string.charAt(n-1));
			}
			else {
				return countVowels(string, n-1) + isVowel(string.charAt(n-1));
					
				}
			
	
		
	}//end countVowels

	public static void main(String[] args) {
		
		String str = "Aaron";
		int n = str.length();
		
		System.out.println("The number of vowels in the string \"" + str +  "\" is: " + countVowels(str,n));

	}//end main method

}//end class
