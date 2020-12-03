package JavaPractice;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String S = "When the world realise its own mistake, corona will dissolve automatically" ;
		
		
		String[] split = S.split(" ");
		
	 for (int i=0;i<=split.length-1;i++)
	    	 
	     {
	    	 if (i%2!=0)
	    		 
	    	 {
	    		 
	    		 StringBuffer sbf = new StringBuffer(split[i]);
	    			
	    			//System.out.println(sbf);
	    			
	    			sbf.reverse().toString();
	    			sbf.append(" ");
	    		 System.out.print(sbf);
	    			
	    			
	    		
	        }
	    	 
	    	 else
	    		 
	    		
	    	  {
	    		
	    		 StringBuffer sbf = new StringBuffer(split[i]);
	    		 sbf.append(" ");
	    		 
	    		System.out.print(sbf);
	    		 
	    		 }
	    	
	  
	     
	     }
	     
	     
	     
	     
		
		 
		
	

	}

}
