package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveValue {

	public static void main(String[] args) {
		
		
		String S ="1,2,3,4,5,6,7,8,9";
		
		char[] Ch = S.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (char c : Ch) {
			
			set.add(c);
			
			
		}
		
		System.out.println(set);
		
		List<Character> list = new ArrayList<Character>();
		
		list.addAll(set);
		
		
		
		System.out.println(list);
		
		System.out.println(list.get(7));
		

	}

}
