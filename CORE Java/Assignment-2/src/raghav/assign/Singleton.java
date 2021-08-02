package raghav.assign;

class Singleton {
	private static Singleton obj=null;
	public String s;
	private Singleton()
	{
		s="Hello India";
	}
	public static Singleton getInstance() {
		if(obj==null) {
			obj=new Singleton();
		}
		return obj;
	}
	
	public static void main(String args[]) {
		Singleton obj1=Singleton.getInstance();
		System.out.println(obj1.s);
		obj1.s="RAW";
		Singleton obj2=Singleton.getInstance();
		System.out.println(obj2.s);
	}

}