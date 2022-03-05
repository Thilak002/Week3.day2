package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FindIntersection {

	public static void main(String[] args) {
		int[] m={3,2,11,4,6,7};
		int[] n={1,2,8,4,9,7};
		
		List<Integer> lt1 = new ArrayList<Integer>();
		
		//Declare for loop iterator from 0 to array length
		for (int i = 0; i < m.length; i++) {	
		lt1.add(m[i]);
		}
		
		//declare a list for 2nd array
		List<Integer> lt2 = new ArrayList<Integer>();
		
		//Declare a nested for another array from 0 to array length
		for (int j = 0; j < n.length; j++) {
			
			lt2.add(n[j]);
		}
		
		//sort list 1 and 2
	    Collections.sort(lt1);
	    Collections.sort(lt2);
	    
	    // retains the same value alone
	     lt1.retainAll(lt2);
	    	 
	     System.out.println("The result is:" +lt1);
	    


	}

	}


