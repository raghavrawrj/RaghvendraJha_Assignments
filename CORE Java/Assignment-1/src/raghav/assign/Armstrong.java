package raghav.assign;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		int temp=a;
		int arm=0;
		int rem;
		while(a>0)
		{
			rem=a%10;
			arm=arm+(rem*rem*rem);
			a=a/10;
		}
		if(temp==arm)
		{
			System.out.println(temp+" "+"is an armstrong number");
		}
		else
		{
			System.out.println(temp+" "+"is not an armstrong number");
		}
        sc.close();

	}

}
