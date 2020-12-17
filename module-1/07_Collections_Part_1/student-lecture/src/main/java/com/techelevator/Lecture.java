package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

			//empty list - with fresh project - making a new list(array list)
		
			List<String> names = new ArrayList<String>(); //names -> new AttayList of Strings on the heap
			
			//Adding to list
			names.add("Tom");
			names.add("Tom A");
			names.add("Tom B");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for(int i = 0; i < names.size(); i++) {
		System.out.println(names.get[i]);
		}
		


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Tom D");
		

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(2, "Tom C");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(1); //removes "Tom B"

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean containsTomC;
		containsTomC = names.contains("Tom C");
		
		System.out.print("names does ");
		if(!containsTomC) {
			System.out.print("not ");
		}
		System.out.print("contains Tom C");

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		int indexOfTomC = names.indexOf("Tom B");
		//index 1

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesAsArray = names.toArray(new String[names.size()]);
		
		for(int i = 0; i < namesAsArray.length; i++)

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		//sort method is called on the collection class
		Collections.sort(names);
		//sorts list into alphebetical ordder - all lowercase comes after all uppercase, and starts with numbers - list is altered after sorting

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		Collections.reverse(names);
		//list is altered after doing this
		
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		//int x = 5;
		Interger x = new Integer(5);
		
		Character c =  new Character('c');
		Double 5.6 = new Double(5.6);
		
		List<Integer> scores = new ArrayList<int>();
		
		

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for(String name : names) {
			System.out.println(name);
		}

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		//First In/First out => FIFO
		
		Queue<String> tasks = new LinkedList<String>();
		//add => offer
		//remove => poll
		
		tasks.offer("Run the sweeper");
		tasks.offer("mop the floor");
		tasks.offer("scrub the toilet");
		
		String nextTask = tasks.poll();
		System.out.println(nextTask);
		//prints Run the sweeper
		//lowers the queue size
		
		while(tasks.size() > 0) {
			System.out.println(tasks.size()); 
			System.out.println(tasks.poll());
		} //prints place in queue and whats removed

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
		//Last in / First Out
		//LIFO
		
		Stack<String> websites = new Stack<String>();
		
		//Add => Push
		//Remove =>Pop
		
		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		websites.push("www.google.com");
		websites.push("www.reddit.com");
		websites.push("www.werd.com");
		
		////////////////////
		// POPPING THE STACK
		////////////////////
		
		System.out.println(websites.pop);
		//removes www.werd.com
		

	}
}
