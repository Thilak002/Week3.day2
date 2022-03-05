package week3.day2;

public class ReverseEvevWords {

	public static void main(String[] args) {
		String even="I am a Software tester";
	    String arr[]=even.split(" ");
	    for (int i = 0; i < arr.length; i++) {
	        if(i%2==0) {
	            System.out.print(arr[i]);
	            System.out.print(" ");
	        }
	        else {//[ am  Software ]
	            char reverse[]=arr[i].toCharArray();
	            for(int j=(reverse.length)-1;j>=0;j-- ) { 
	                System.out.print(reverse[j]);
	        }
	            System.out.print(" ");
	    }

	}
	}

}
