package JavaPractice;

import java.util.Arrays;

public class SortAndReverseArray {

	public static void main(String[] args) {
		
		
		int[] a = {5,1,33,79,22,11,45};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
			
			
		}
		
		System.out.println("********************************");
		
        for (int i = a.length-1; i >=0; i--) {
        	
        	
        	System.out.println(a[i]);
        	
			
		}
		
		

	}

}
