package raghav.assign;

import java.util.Scanner;

public class IncomeTAX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int inc=s.nextInt();
        if(inc>0&&inc<=180000)
        {
      	  System.out.println("Tax paid is Nil");
        }
        else if(inc>180000&&inc<=300000)
        {
      	  int tax=(inc*10)/100;
      	  System.out.println("Tax paid is "+tax);
      	  
        }
        else if(inc>300000&&inc<=500000)
        {
      	  int tax=(inc*20)/100;
      	  System.out.println("Tax paid is "+tax);
      	  
        }
        else if(inc>500000&&inc<=1000000)
        {
      	  int tax=(inc*30)/100;
      	  System.out.println("Tax paid is "+tax);
      	  
        }
        s.close();
	}

}

