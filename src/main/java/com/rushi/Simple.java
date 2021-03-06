package com.rushi;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Simple {

	public Simple(){
		System.out.println("Simple Constructor!!");
		}

	public void greet(){
			List<String> lst = new ArrayList<String>();
			
			lst.add("Hello ");
			lst.add("Maven");
			
			for(String ele : lst){
				System.out.println("Greeting "+ele);
			}
			
			System.out.println("-----------------------------");
	}

	public int count_words(String words){
		String[] sepratewords	=	StringUtils.split(words,' ');
		return (sepratewords == null) ? 0 : sepratewords.length;
	}
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("Welcome Rushikesh!!");
		System.out.println("Good Morning");
		System.out.println("-----------------------------");
		Simple samp = new Simple();
		samp.greet();
		
		System.out.println("count : "+samp.count_words("Hello Rushi How are you?"));
		
	}

}
