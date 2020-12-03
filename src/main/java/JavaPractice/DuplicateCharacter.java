package JavaPractice;

import java.util.ArrayList;



public class DuplicateCharacter {

	public static void main(String[] args) {
		
		
		String S = "When life gives you lemons, make lemonade" ;
		
		char[] Ch = S.toCharArray();
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		for (Character C : Ch) {
			
			
			
		if (!list.contains(C))
				
			{
				
			list.add(C);
			
			
			}
			
		
			
			  else
			  
			  {
			  
			  System.out.print(C+",");
			  
			  
			  
			  }
		
		
			 
			
		}
	
		
	
		
		
		
		
		
				
		
		
		
		
		
	}

}
