package raghav.assign;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		StringBuilder str=new StringBuilder();
		
		for(Map.Entry<Integer,String> entry: hm.entrySet())
		{	
			str.append(entry.getKey());
			str.append(entry.getValue());
		}
		
		Consumer<StringBuilder> lamda1=snew->System.out.println(snew);
		lamda1.accept(str);

	}

}
