package collectionpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/* Set doesnt allow duplicates and it can allow null values if the elements can searching time it can show the 
 * null pointer exception
 * linked hash set can allow one null value
 * hash set can allow null values
 * tree set doesn't allow null values*/
 
public class Linkedhastset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer> set=new LinkedHashSet<Integer>();
      Set<String> s1=new HashSet<>();
      Set<Boolean> s2=new TreeSet<>();
      Set<Boolean> s3=new TreeSet<>();
      set.add(1);
      set.add(2);
      set.add(3);
      set.add(null);
      s1.add("apple");
      s1.add("mango");
      s1.add("grape");
      s2.add(true);
      s2.add(false); 
      s2.add(true);
      s1.add("grape");
      s1.add(null);
	  System.out.println(set);//it can print the linked hash set elements// 
	  System.out.println(s1);//it can print the hash set elements//
	  System.out.println(s2);//it can print the tree set elements//
	  System.out.println(set.size());
	  // it can print the size of the linked hash set and returns the integer value//
	  System.out.println(s1.size());//print the size of the hashset//
	  System.out.println(s2.size());//print the size of the tree set//
	  System.out.println(set.contains(3));//it can checks the element is present or not//
	  System.out.println(s1.isEmpty()); //it can check the set is empty or not//
	  System.out.println(s2.removeAll(s2));//it can remove all elements of the set//
      System.out.println(s2);//it can print the set elements//
      System.out.println(s2.equals(s3));
      // it can checks the two sets are equal or not based on data type
      //System.out.println(s2.addAll(s3));
      System.out.println(s1.remove(null));
      //it can remove the element if it is present then give true otherwise return false
      System.out.println(s1);// it can print the hashset
      Iterator<String> i=s1.iterator();
      // through iterator it can print the next element only if we can give loop in the has next method then give the all elements one by one present in set
      while(i.hasNext()) {
           System.out.println(i.next());
      }
      System.out.println(s1.hashCode());// it can print the hash code of the paricular set we can given
	  for(String x:s1) {
		  if(x.charAt(0)=='a') {
			  System.out.println(x);
		  }
	  }
	  for(String y:s1) {
		  if(y.contains("e")) {
			  System.out.println(y);
		  }
	  }
	  System.out.println(s1);
	}

}
