package raghav.assign;

import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	      int a=s.nextInt();
	      int b=s.nextInt();
	      int c=s.nextInt();
	      if(a>60&&b>60&&c>60)
	      {
	    	  System.out.println("Passed");
	      }
	      else if((a>60&&b>60)||(b>60&&c>60)||(c>60&&a>60))
	      {
	    	  System.out.println("Promoted");
	      }
	      else if((a>60||b>60||c>60)||(a<60&&b<60&&c<60))
	      {
	    	  System.out.println("Failed");
	      }
	      s.close();
	}

}
