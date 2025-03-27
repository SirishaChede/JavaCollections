package collectionpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
/* array dequeue can't allow null values and allow duplicate values*/

public class DequeueAndArrayQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d1=new ArrayDeque<>();
		Deque<String> d2=new ArrayDeque<>();
		d1.add("apple");
		d1.add("mango");
		d1.add("grape");
		d1.add("banana");
		d2.add("java");
		d2.add("python");
		d2.add("sql");
		d1.add("apple");
		//d2.add(null);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.contains("java"));//it can checks if given string  is present or not
		System.out.println(d1.element());//it returns the top element of the dequeue
		System.out.println(d1.equals(d2));//it checks two queues are equal or not
        System.out.println(d1.getFirst());//it returns the first element 
        System.out.println(d1.getLast());//it returns the last element of the queue 
        System.out.println(d1.isEmpty());//it checks the queue is empty or not
        System.out.println(d2.peek());//it return the starting element of the queue 
        System.out.println(d2.poll());// it removes the starting element in the queue
        System.out.println(d2.pollFirst());// it removes the first element of the queue
        System.out.println(d2.pollLast());// it removes the last element of the queue
        System.out.println(d2);//return queue elements after removing it is empty
        System.out.println(d2.isEmpty());//it checks it is empty or not
        System.out.println(d1.offerFirst("java"));//it can add the element we can given then add it to first place
        Iterator<String> i=d1.iterator();
           while(i.hasNext()) {
        	   System.out.println(i.next());           }
	}

}
 