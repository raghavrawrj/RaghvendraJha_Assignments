package raghav.assign;

import java.util.*;
public class HandLSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet();
		h.add("AMit");
		h.add("Phogat");
		h.add("Suresh");
		h.add("Ankur");
		Iterator<String> i=h.iterator();
		System.out.println("hashset elements(added randomly):");
		while(i.hasNext()) {System.out.println("" +i.next()+"");}
		LinkedHashSet<String> lh=new LinkedHashSet();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		Iterator<String> ii=lh.iterator();
		System.out.println("Linked hashset elements(this is ordered):");
		while(ii.hasNext()) {System.out.println("" +ii.next()+"");}
	}

}
