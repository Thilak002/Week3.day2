package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		Set<Integer> st = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			//adding values to treeSet
			st.add(data[i]);	
		
		}
		
		List<Integer> lt = new ArrayList<Integer>(st);
		
		//get the size of list
		int size = lt.size();
		
		//getting the second largest value from the list 
		System.out.println("Second Largest Number is:"+ lt.get(size-2));
       


}
	}


