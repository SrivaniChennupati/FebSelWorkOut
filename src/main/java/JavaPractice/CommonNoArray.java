package JavaPractice;

import java.util.Arrays;

public class CommonNoArray {

	public static void main(String[] args) {
		
		
		int[] a1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		
		Arrays.sort(a1);
		
		int[] a2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		
		Arrays.sort(a2);
		
		for (int i = 0; i < a1.length; i++) {
			
			for (int j = 0; j < a2.length; j++) {
				
				if (a1[i]==a2[j])
					
				{
					
					System.out.println(a2[j]);
				}
				     
				    		  
				   
				    		  
				    		  
				
			}
			
		}
		
		
		

	}

}
