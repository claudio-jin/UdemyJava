package application;

import java.util.HashSet;
import java.util.Set;

public class Program10 {
		public static void main(String[] args) {
		
		//hashset nao garante a ordem porem é rapido
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
		System.out.println(p);
		
		//treeset garante a ordem porem é um pouco mais devagar
//			Set<String> set = new TreeSet<>();
//			
//			set.add("TV");
//			set.add("Notebook");
//			set.add("Tablet");
//			
//			System.out.println(set.contains("Notebook"));
//			
//			for (String p : set) {
//			System.out.println(p);
		
		//LinkedHashSet
				
		}
	}
}
