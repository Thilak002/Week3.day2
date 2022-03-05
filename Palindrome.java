package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
      String s = "madam",
				
				rev = ""; 
		
			    int length = s.length();
               for (int i = length - 1; i >= 0; i--) {
			      
			   rev = rev + s.charAt(i);
			   
			     if (s.equals(rev)) {
			      System.out.println("The string is a palindrome.");
			    }
			    else {
			      System.out.println("The string isn't a palindrome.");
			    }
	}

}
	}


