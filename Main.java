package net.ukr.geka3;

import java.util.ArrayDeque;

public class Main {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		String sheldon = "Sheldon";
		String leonard = "Leonard";
		String volovitc = "Volovitc";
		String kutrapalli = "Kutrapalli";
		String penny = "Penny";
		
		int numOfGlasses = 2;
		
		 ArrayDeque<String> deq = new ArrayDeque<>();
		 
		 deq.addLast(sheldon);
		 deq.addLast(leonard);
		 deq.addLast(volovitc);
		 deq.addLast(kutrapalli);
		 deq.addLast(penny);
		 
		 System.out.println("before " + deq);
		 
		 for(int i = 0; i < numOfGlasses; i++){
			 deq.addLast(deq.peekFirst());
			 deq.addLast(deq.pollFirst());
		
		 }
		 
		 System.out.println("after " + numOfGlasses + " glasses " + deq );
		 
	}

	

}
