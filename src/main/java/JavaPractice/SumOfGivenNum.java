package JavaPractice;

public class SumOfGivenNum {

	public static void main(String[] args) {
		
		String s= "asdf1qwer9as8d7" ;
		
		String S1 = s.replaceAll("[^0-9.]","");
		
		System.out.println(S1);
		
		int Integervalue = Integer.parseInt(S1);
		
		int m = Integervalue ,n , sum=0;
		
		while (m>0)
			
		{
			n=m%10;
			
			sum = sum+n;
			
			m=m/10;
			
			
		}
		
		System.out.println("Sum of the digits is " +sum);

	}

}
