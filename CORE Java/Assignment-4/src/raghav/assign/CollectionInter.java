package raghav.assign;
import java.util.ArrayList;

public class CollectionInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Raghav");
		list.add("is");
		list.add("the");
		list.add("future");
		list.add("!!");
		System.out.println(list);
		list.removeIf(s->(s.length()%2)!=0);
		System.out.println(list);
	}

}
