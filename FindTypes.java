package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		//here is input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";
				// Here is what the count you need to find
						int  letter = 0, space = 0, num = 0, specialChar = 0;
						
						char[] ch = test.toCharArray();
		                 for (char each : ch) {
							
							if(Character.isLetter(each)==true) 
					
								letter++;
			               
						        else if(Character.isDigit(each)==true) 
								
								   num++;
							
							    else if(Character.isSpaceChar(each)==true) 
							   
							      space++;
						
						    else
					
						    specialChar++;
						
						}	
		              // Print the count here
		 				System.out.println("letter: " + letter);
		 				System.out.println("space: " + space);
		 				System.out.println("number: " + num);
		 				System.out.println("specialCharacter: " + specialChar);


			}
	}


