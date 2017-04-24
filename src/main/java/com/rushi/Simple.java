package com.rushi;

import java.util.ArrayList;
import java.util.List;

public class Simple {

	public void greet(){
			List<String> lst = new ArrayList<String>();
			
			
			lst.add("Hello ");
			lst.add("Maven");
			
			for(String ele : lst){
				System.out.println("Greeting "+ele);
			}
			
		
			System.out.println("-----------------------------");
	}

	public Simple(){
		System.out.println("Simple Constructor!!");
	}

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Welcome Rushikesh!!");
		System.out.println("Good Morning");
		System.out.println("-----------------------------");
		Simple samp = new Simple();
		samp.greet();
		
		
		
	}

}
