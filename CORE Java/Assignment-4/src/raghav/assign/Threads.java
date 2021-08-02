package raghav.assign;

import java.util.ArrayList;
import java.util.function.Consumer;
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		list.add(101);
		list.add(202);
		list.add(303);
		list.add(404);
		list.add(505);
	Consumer<ArrayList> lamda1= (l)->{
		System.out.println(l);
	};
	print(list,lamda1);
	}
	//created new thread which prints all the integer from list using Consumer interface:
	private static void print(ArrayList<Integer> list, Consumer<ArrayList> lamda1) {
		Thread mylamda=new Thread(()->{
			lamda1.accept(list);
			});
		mylamda.run();
	}

}
