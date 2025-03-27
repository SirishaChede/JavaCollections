package collectionpackage;
/* List can allow duplicate values and also it can allow null values
 *  while in the searching time it can,t allow null values it can show null pointer exception*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		List<Integer> l2= new LinkedList<>();
		List<Float> l3=new Vector<>();
		List<Float>l4=new ArrayList<>();
		List<Integer>l5=new ArrayList<>();
		
		l4.add(2.34f);
		l4.add(4.34f);
		l4.add(4.01f);
		l1.add("apple");
		l1.add("banana");
		l1.add("grape");
	    l1.add("orange");
	    l2.add(1);
	    l2.add(2);
	    l2.add(3);
	    l2.add(4);
	    l2.add(null);
	    l3.add(2.34f);
	    l3.add(4.34f);
	    l3.add(4.01f);
	    l3.add(null);
	    l1.add("apple");
	    l1.add(null);
	    l5.add(10);
	    l5.add(20);
	    l5.add(30);
	    
	    System.out.println(l1);// print the array list elements
	    System.out.println(l2);//print the linked list elements
	    System.out.println(l3);//print the vector elements 
	    System.out.println(l1.add("guava"));//it can add the element
	    System.out.println(l1);//prints the array list
	    l1.add(2,"kiwi");//add the given string at the given particular position 
	    System.out.println(l1);//print the array list
	    System.out.println(l1.contains("apple"));//checks the given string is present or not
	    System.out.println(l1.indexOf("apple"));//return the index value of given string
	    System.out.println(l1.lastIndexOf("apple"));//return the last index value the given string is present in last index value
	    System.out.println(l1);//print the array list
	    System.out.println(l1.equals(l3));//checks the given two lists are equal or not
	    System.out.println(l1.get(0));//return the String where it can present in the given index value
	    System.out.println(l3.containsAll(l4));// it can checks the all the elements present in the array list and vector 
	    System.out.println(l1.getFirst());// it can return the first element of the array  list
	    System.out.println(l1.getLast());//it can return the last element of the array list
	    System.out.println(l3.addAll(2, l4));//it can return the boolean values 
	    System.out.println(l4);//prints arraylist
	    System.out.println(l1.isEmpty());//it checks given arraylist is empty or not
	    System.out.println(l3.remove(l4));//it can remove the arraylist elements
	    System.out.println(l3);//it can prints  the vector elements
	    System.out.println(l4);// it can prints the arraylist
	    System.out.println(l1.toString());
	    System.out.println("using iterator print one by one");
	   Iterator<String> i=l1.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
		   
	   }
	   System.out.println(l2.indexOf(3));
	   System.out.println(l2.add(5));
	   System.out.println(l2.add(6));
	   System.out.println(l2.addAll(l5));//true,it can add all elements which can present in the l5 variable collection to the l2
	   System.out.println(l2);
	   System.out.println(l5);
	   System.out.println(l2.contains(10));//true,it can checks only the given element is present in the particular list or not
	   System.out.println(l2.containsAll(l5));//true, it can checks all the elements  which are present in the l5 is present in the l2 or not
	   System.out.println(l5.containsAll(l2));//false,it return false because the elements which all are present in l2 is not present in the l5	   
	   System.out.println(l2.retainAll(l5));//true,it will checks the the elements present in l5 can retain all the elements in l2 
	   System.out.println(l5.retainAll(l2));//false,it will checks the the elements present in l2 can retain all the elements in l5 
	   System.out.println(l2.remove(l5));
	   System.out.println(l2);
	   	  //it will prints the specific character is present at the first index 
 	     System.out.println("it will prints the specific character is present at the first index");  
         	for(String j:l1) {
         		if(j.charAt(0)=='a') {
         			System.out.println(j);
         		}
         		
         	}
         	//it will return  the string specified character is present in anywhere
         	System.out.println("it will return  the string specified character is present in anywhere");
         for(String k:l1) {
        	 if(k.contains("p")) {
        		 System.out.println(k);
        	 }
         }
	}

}
