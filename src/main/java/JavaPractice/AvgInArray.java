package JavaPractice;

public class AvgInArray {

	public static void main(String[] args) {
		
		int[] a= {20, 30, 25, 35, -16, 60, -100};
		
		int Sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			Sum = Sum +a[i] ;
			
			}
		
		double avg = Sum /a.length ;
		
		System.out.println(avg);
		
		
		

	}

}
