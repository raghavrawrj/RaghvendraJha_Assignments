package raghav.assign;
import java.util.ArrayList;
import java.util.function.Consumer;
public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> slist=new ArrayList<>();
		slist.add("I ");
		slist.add("am");
		slist.add("Raghvendra");
		slist.add("Jha");
		System.out.println(slist);
		///used StringBuilder
		StringBuilder s =new StringBuilder();
		for(String str:slist) {
			s.append(str.charAt(0));
		}
		//used consumer interface:
		Consumer<StringBuilder> lamda1=snew->System.out.println(snew);
		lamda1.accept(s);
	}

}
