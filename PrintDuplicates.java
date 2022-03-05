package week3.day2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
      int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			l1.add(arr[i]);
		}
	
		int size = l1.size();
		
		Set<Integer> st = new HashSet<Integer>();
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		for(int j=0; j<size; j++) {
			
			if(!st.add(l1.get(j))) {
				
		        l2.add(l1.get(j));		
			}
				
		}
		
		System.out.println("Duplicates in the given array is:" + l2);

	}


	}


