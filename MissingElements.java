package week3.day2;
import java.util.ArrayList;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
      int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
		
			l1.add(arr[i]);	
		}		
			
		List<Integer> l2 = new ArrayList<Integer>(l1);
		
		for (int j = 1; j < 9; j++) {
			
			l2.add(j);
		
		}
		
		
		l2.removeAll(l1);
		
		System.out.println("Missing Element is:" + l2);


	}
	}


