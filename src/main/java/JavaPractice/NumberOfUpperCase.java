package JavaPractice;

public class NumberOfUpperCase {

	public static void main(String[] args) {
		
		int UpperCaseCount=0; int LowerCaseCount=0; int DigitCount=0;int SpacesCount =0;
		
		String S = "1. It is Work from Home  not Work for Home" ;
		
		char[] Ch = S.toCharArray();
		
		for (char c : Ch) {
			
			
			
			if (Character.isUpperCase(c))
				
			{
			
				UpperCaseCount++;
				
			}else if (Character.isLowerCase(c))
				
			{
				
				LowerCaseCount++;
			}
			
			else if (Character.isDigit(c))
				
			{
				DigitCount++;
				
			}
			
			else 
			{
				SpacesCount++;
				
			}
			
			
		}
		
		System.out.println("Uppercase characters" +UpperCaseCount);
		
		System.out.println("Lowercase characters" +LowerCaseCount);
		
		System.out.println("Number count is " +DigitCount);
		
		System.out.println("Spaces count is " +SpacesCount);
		
	}

}
