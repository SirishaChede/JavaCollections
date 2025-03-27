package collectionpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/*->"hashmap": it does not allow duplicate values keys are not allowed but values are allowed
   in hash map in keys it can allow only one null value but values it can take more null values
   both side will give the null values it can accept it can give the output as ascending orderd
   ->"linked hashmap": in the linked hash map it can also same as hash map but it can give output 
   what way we can given then that way the output will be coming
   ->"tree map": In the tree map it can't accept null values on the keys and it can accept only values in null 
   and values can accept the duplicate values. */
public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<>();
		Map<Integer,String> m2=new LinkedHashMap<>();
		Map<Integer,String> m3=new TreeMap<>();
		m1.put(1, "java");
		m1.put(2, "python");
		/*m3.put(3, null);
		m1.put(null, "c");
		m1.put(null, null);*/
	    m2.put(1,"apple");
		m2.put(2, "banana");
		m1.put(3,"mango");
		m3.put(1, "car");
		m3.put(2, "bike");
		m3.put(4, "cycle");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		//System.out.println(m1);
		m1.putIfAbsent(4, "sql");
//this method is used to add the key and value in the hash map if it is absent then only added if it present then it cant add
	System.out.println(m1.values());//it can print the only values
	System.out.println(m1.keySet());
	System.out.println(m1.entrySet());
		System.out.println(m3);
		System.out.println(m1);
		for(Map.Entry m:m1.entrySet()){//print the all elements in the map
			 
				System.out.println(m.getKey()+""+m.getValue());
			 
			
			
		}
		System.out.println("iteration");
	Iterator<Integer> i= m2.keySet().iterator();//it cant accept the null values.
		 while(i.hasNext()){  
			 int key=(int)i.next();
			 System.out.println(key+ m2.get(key));  
		 }
		 
		          
		

	}
}


