package application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	
//	Tipo curinga ? o supertipo de qualquer tipo
	public static void main(String[] args) {
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myObjs = myNumbers;
		
		
		Object obj;
		Integer x = 10;
		obj = x;
	}
}
