package raghav.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class API {
	public static void main(String[] args) {
		ArrayList<FRUITS> flist= new ArrayList<>();
		flist.add(new FRUITS ("Mango",66,100,"yellow"));
		flist.add(new FRUITS ("banana",167,50,"yellow"));
		flist.add(new FRUITS ("apple",67,150,"red"));
		flist.add(new FRUITS ("graps",65,100,"green"));
		flist.add(new FRUITS ("strawberry",77,200,"red"));
		
		ArrayList<NEWS> nlist= new ArrayList<>();
		nlist.add(new NEWS(1,"sneha","sachin","Good"));
		nlist.add(new NEWS(1,"abhishek","sachin","Great explained"));
		nlist.add(new NEWS(2,"pratik","neha","nice one"));
		nlist.add(new NEWS(3,"pratiksha","neha","nice budget"));

		
		ArrayList<Traders> tlist= new ArrayList<>();
		Traders t1=new Traders("pushpak","indore");
		Traders	t2=new Traders("parth","delhi");
		Traders t3=new Traders("ravi","pune");
		Traders t4=new Traders("amrut","pune");
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		tlist.add(t4);
		
		ArrayList<Transactions> tclist= new ArrayList<>();
		tclist.add(new Transactions (1999,1000,t1));
		tclist.add(new Transactions (2000,1500,t2));
		tclist.add(new Transactions (2015,1200,t3));
		tclist.add(new Transactions (2011,2002,t4));
		tclist.add(new Transactions (2011,2000,t4));
		tclist.add(new Transactions (2011,2005,t4));
		
		nlist.forEach(System.out::println);
		
		System.out.println("\n----------------------------------------------------");
		//1.
		flist.forEach(System.out::println);
		flist.stream()
		.filter(n->n.getCalories()<100)
		.sorted((o1,o2)->o2.getCalories()-o1.getCalories())
		.forEach(n->System.out.println(n.getName()));
		System.out.println("\n----------------------------------------------------");
		
		//2.
		flist.stream()
		.sorted((o1,o2)->o1.getColor().compareTo(o2.getColor()))
		.forEach(m->System.out.println(m.getName()+": "+"\t"+m.getColor()));
		System.out.println("\n----------------------------------------------------");
		
		//3.
		flist.stream()
		.filter(n->n.getColor().equalsIgnoreCase("red"))
		.sorted((o1,o2)->o1.getPrice()-o2.getPrice())
		.forEach(m->System.out.println(m.getName()+": "+"\t"+m.getPrice()+"\t"+m.getColor()));
		System.out.println("\n----------------------------------------------------");
		
		//4.
		//find out newsid wich has received maximum comments using stream api
       NEWS i= nlist.stream()
        .max((n1,n2)->n1.getComment().length()-n2.getComment().length())
        .get();
       System.out.println(i.newsId);
       System.out.println("\n----------------------------------------------------");
	
		//5.
       //find out how many times the word budget has been mentioned in comments
       nlist.stream()
       .filter(n->n.getComment().contains("budget"))
       .forEach(n->System.out.println(n.getComment()));
       System.out.println("\n----------------------------------------------------");
       
		//6.
       //find out which user has posted maximum comments
        NEWS c=nlist.stream()
       .max((n1,n2)->n1.getCommentbyuser().length()-n2.getCommentbyuser().length())
       .get();
        System.out.println(c.commentbyuser+"\t"+c.getNewsId());
       System.out.println("\n----------------------------------------------------");
       
		//7.
       //display commentbyuser wise number of comments
       	nlist.stream().map(n->n.getCommentbyuser())
       .distinct()
       .forEach(n->System.out.println(n+" "+nlist.stream().filter(n1->n1.getCommentbyuser().equals(n)).count()));
       	System.out.println("\n----------------------------------------------------");
		//8.
		tclist.stream()
		.filter(n->n.getYear()==2011)
		.sorted((o1,o2)->o1.getValue()-o2.getValue())
		.forEach(System.out::println);
		System.out.println("\n----------------------------------------------------");

		tlist.forEach(System.out::println);
		//9.
		 tlist.stream()
		.distinct()
		.forEach(m->System.out.println(m.getCity()));
		
		
		System.out.println("\n----------------------------------------------------");
		//10.
		tlist.stream()
		.filter(n->n.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()))
		.forEach(m->System.out.println(m.getName()+"\t"+m.getCity()));
		System.out.println("\n----------------------------------------------------");
		//11.
		tlist.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(m->System.out.println(m.getName()));
		System.out.println("\n----------------------------------------------------");
		tclist.forEach(System.out::println);
		//12.
		tclist.stream()
		.filter(n->n.t.getCity().equalsIgnoreCase("indore"))
		.forEach(m->System.out.println(m.t.getCity()+"\t"+m.t.getName()));
		System.out.println("\n----------------------------------------------------");
		//13.
		tclist.stream()
		.filter(n->n.t.getCity().equalsIgnoreCase("delhi"))
		.forEach(m->System.out.println(m.getValue()+"\t"+m.t.getCity()));
		System.out.println("\n----------------------------------------------------");
		//14.
		Transactions m=tclist.stream()
		.max((o1,o2)->o1.getValue()-o2.getValue())
		.get();
		System.out.println(m.getValue());
		System.out.println("\n----------------------------------------------------");
				
		//15.
		Transactions min=tclist.stream()
		.min((o1,o2)->o1.getValue()-o2.getValue())
		.get();
		System.out.println(min.getValue());
		
	}
	
	

}