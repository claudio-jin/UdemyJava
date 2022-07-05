package application;

import java.util.Arrays;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	//O tipo coringa nao deixa adicionar na lista
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}