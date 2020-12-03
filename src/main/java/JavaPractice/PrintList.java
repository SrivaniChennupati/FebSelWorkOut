package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		
		String S = "Bugatti Chiron";
		
		char[] Ch = S.toCharArray();
		
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character C : Ch) {
			
			list.add(C);
			
		}
		
		
		System.out.println(list);
		
		
		
		for (Character eachCharacter : list) {
			
			
			System.out.println(eachCharacter);
			
		}
		
		
		System.out.println("****************************");
		
		for (int i=0;i<=list.size()-1;i++)
			
		{
			System.out.println(list.get(i));
			
		}
		
		
		System.out.println("****************************");
		
		
		Iterator<Character> it = list.iterator();
		
		while(it.hasNext())
			
		{
			
			Character next = it.next();
			
			System.out.println(next);
			
			
		}
		
		
		
		
	
	
		

	}

}
