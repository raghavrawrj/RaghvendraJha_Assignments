package raghav.assign;

import java.util.*;
public class ListL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(23);
		l.add(24);
		l.add(25);
		l.add(26);
		l.add(27);
		
		System.out.println(l);
		
		Iterator i=l.iterator();
		
		System.out.println("given elements:");
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
		ListIterator listIterator = l.listIterator(l.size()); 
		System.out.println("given elements in reverse order:");
		while (listIterator.hasPrevious()) {
			
		    System.out.println(listIterator.previous());
		}
	}

}
