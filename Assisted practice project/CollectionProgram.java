package phase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionProgram {

	public static void main(String[] args) {
		//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> name=new ArrayList<String>();   
			      name.add("ramesh");//
			      name.add("suresh");    	   
			      System.out.println(name);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vect = new Vector<Integer>();
			      vect.addElement(15); 
			      vect.addElement(10); 
			      vect.addElement(30);
			      System.out.println(vect);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("ramesh");  
			      names.add("suresh");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(10);  
			       set.add(11);  
			       set.add(12);
			       set.add(13);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	} 
			      }  
			



	}


