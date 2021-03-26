package Collactions;

import java.util.LinkedList;

public class TestPerformance {
	public static void main (String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		
		for (int i = 0; i < 5_000_000; i++) {
			numbers.add(i);    
			
		}
		
		int a = 0; 
		
//		for( Integer number : numbers) {
//			
//			a = number;
//		}
		
		
		for (int i = 0; i < 5_000_000; i++) {
			a = numbers.get(i);
			
		}
		System.out.print(a);
	}
}
