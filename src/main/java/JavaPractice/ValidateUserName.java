package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {

	public static void main(String[] args) {
		
		
		List<String> list =  new ArrayList<String>();
		
		list.add("Balaji_1");
		list.add("Testleaf$123");
		
		String regex = "[A-Za-z0-9._@$]{8,}" ;
		
		
		 Pattern p = Pattern.compile(regex);
		    
		    for (String username : list) {
		    	
		    	Matcher M= p.matcher(username);
		    	
		    	System.out.println(username +" : "+M.find());
				
			}
		    
		    

	}

}
