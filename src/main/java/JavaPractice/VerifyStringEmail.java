package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyStringEmail {

	public static void main(String[] args) {
		
		
		List<String> list =  new ArrayList<String>();
		
		list.add("balaji.chandrasekaran@testleaf.com");
		
	    list.add("balaji.c@tunatap.co.uk");
	    
	    list.add("naveen e@tl.com");
	    
	    //String regex = "^[A-Za-z0-9+_.-]+@(.+)$" ;
	    
	    String regex = "[A-Za-z0-9._]+@[a-z0-9]+.[a-z]" ;
	    
	    Pattern p = Pattern.compile(regex);
	    
	    for (String email : list) {
	    	
	    	Matcher M= p.matcher(email);
	    	
	    	System.out.println(email +" : "+M.find());
			
		}
	    
	    

	}

}
