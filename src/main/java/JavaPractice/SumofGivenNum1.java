package JavaPractice;

public class SumofGivenNum1 {

	public static void main(String[] args) {
		
		int sum =0;
		String s= "asdf1qwer9as8d7" ;
		
		char[] Ch = s.toCharArray();
		
		for (char c : Ch) {
			
			if (Character.isDigit(c))
				
			{
				
				 Character C11 = c;
				 
				 //System.out.println(C11);
				 
				 String string = C11.toString();
				 
				 int integer = Integer.parseInt(string);
				 
				 sum = sum + integer;
				 
				
			  
				
				
			}
			
			 
		}
		
		
		 System.out.println(sum);

	}

}
