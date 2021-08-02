package raghav.assign;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr=new int[15];
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(key==arr[i])
			{
				System.out.println("Element "+key+" is present in array");
				break;
				
			}
		}
		s.close();
	
	}

}

