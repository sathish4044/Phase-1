package phase1;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		//Map
		//hash map
		System.out.println("\n The Elements of Hash Map are");
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(11, "Sachin");
		hm.put(17, "Raina");
		hm.put(07, "Dhoni");
		hm.put(25, "kholi");
		hm.put(37, "Jadeja");
		hm.put(13, "Yuvaraj");
		System.out.println(hm);
		System.out.println(hm.size());
        Set<Integer> ks = hm.keySet();
        System.out.println(ks);
        
        //Hash table
        System.out.println("\n The Elements of Hash Table are");
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(01, "Apple");
        ht.put(02, "Orange");
        ht.put(03, "Papaya");
        ht.put(04, "Grapes");
        ht.put(05, "Watermelon");
        ht.put(06, "Pineapple");
        System.out.println(ht);
        System.out.println(hm.size());
        //Tree map
        System.out.println("\n The Elements of Tree Map are");
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"One");
        tm.put(22,"Twenty Two");
        tm.put(333,"Three Hundred And Thirty Two");
        tm.put(4444,"Four Thousand Four hundred And Forty Four");
        tm.put(55555,"Fifty Five Thousand Fifty Five");
        System.out.println(tm);
        System.out.println(hm.size());
    }

}
