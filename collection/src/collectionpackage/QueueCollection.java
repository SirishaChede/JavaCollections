package collectionpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
/*  queue doesnt allow null values and allow duplicate values 
 * in the priority queue it can give the queue values as acending order*/
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q1=new PriorityQueue<>();
		Queue<String> q2=new PriorityQueue<>();
        q1.add("python");
        q1.add("java");
        q1.add("c");
        q1.add("c++");
        q1.add("c");
        q1.add("java");
        q1.add("python");
        //q1.add(null);// it doesnt allow null values
        q2.add("100");
        q2.add("200");
        q2.add("300");
        System.out.println(q1);//it prints the queue elements based on the priority we can give numbers as Strings then convert to asc
        System.out.println(q1.addAll(q2));//it will add all elements present in q2 add to a1 
        System.out.println(q2);//it will prints q2 elements
        System.out.println(q1);//it prints a1 elements after adding
        System.out.println(q1.contains("100"));//it checks given string is present or not in the queue
        System.out.println(q1.equals(q2));//it compares two queues are equal or not
        System.out.println(q1.containsAll(q2));//it checks q2 all elements present in q1 or not
        System.out.println(q1.isEmpty());//it checks queue is empty or not
        System.out.println(q1.peek());//it can print the peek element means print the starting element of the priorityqueue
        System.out.println(q1.poll());// it can remove the head/first element in the queue 
        System.out.println(q1);//it print the q1 after removing the elements
        System.out.println(q1.remove(100));//it remove the given element if it is present
        System.out.println(q1.equals(q2));//it can checks if two queues are equal or not.
        //q1.add("java");
        //q1.add("python");
        System.out.println(q1);
        System.out.println("using iterator");
        Iterator<String> i=q1.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        System.out.println("it prints c contain the given strings");
        for(String x:q1) {
        	if(x.contains("c")) {
        		System.out.println(x);
        	}
        }
        }
        
	}


