package collectionpackage;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		//String[] array= {"java","python","c","sql"};
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>(); 
		set.add("python");
		set.add("java");
		set.add("sql");
		set.add("javascript");
		set.add("srija");
		set.add("adbvjdhbc");
		set.add("python");
		//set.add(null); it doesnt allow while searching time.
		
		//System.out.println(StartsWith('j'));
		
		 System.out.println(set);//it can print the set
		System.out.println(set.remove("sql"));
		//it can remove the sql element return boolean values if element is present then it can remove give true otherwise false  
		System.out.println(set.remove("c"));// it can remove the c element
		System.out.println(set.size());// it can return the size of the set in integer value
		System.out.println(set.add("sql"));//it can add the value to the already exixting set
		System.out.println(set.add("c++"));//it can add the value to the already exixting set 
		System.out.println(set.size());//it returns the size
		System.out.println(set);//it can prints the set elements
		System.out.println(set.add("c"));
		System.out.println(set);
		System.out.println(set.add("cn"));
		System.out.println(set);
		System.out.println(set.contains("sql"));
		// it can checks element is present or not if present return true otherwise return false
		System.out.println(set.size());
		System.out.println("using iterator");
		 Iterator<String> i=set.iterator();  //using iterator we can print the one by one element  
        while(i.hasNext())    
        {    
        System.out.println(i.next());    
        }
        System.out.println("contain the particular string specified character");
        //prints the elements which can contain the particular character that contains then return that string  
        for(String x:set) {
 	       if(x.contains("j")) {
 	    	   
 	       
         	 System.out.println(x);
         	   }
            }
        System.out.println("specified character present in  the first position");
        //it can prints the string first letter contain the particular letter then return all the strings
        for(String m:set) {
            
            {
                if(m.charAt(0)=='j') {
                    
                
             System.out.println(m);
                }
            }
 		}

        
	}

}
