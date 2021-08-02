package raghav.assign;

abstract class person{
	String name;
	int age;
	person()
	{
	 name="RJ";
     age=22
			;}
	void display() {
		System.out.println("Person info is:"+"\n "+"name: "+name+"\n "+"age: "+age);
	}
	 abstract void displayADD() ;
	
}
class student extends person{
	String add="India";
	student(){
		super();
	}
	@Override
	void displayADD() {
		
		System.out.println("this is address :"+" "+add);
	}
	
}
public class AbstractC {

	public static void main(String[] args) {
		student s=new student();
	    s.display();
		s.displayADD();
		
		

	}

}
