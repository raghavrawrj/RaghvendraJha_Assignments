package raghav.assign;


public class RangeArmstrong {

	public static void main(String[] args) {
		for(int i=100;i<1000;i++)
		{
			int temp,rem,arm=0;
			temp=i;
			while(temp>0)
			{
				rem=temp%10;
				arm+=(rem*rem*rem);
				temp=temp/10;
			}
			if(arm==i)
			{
				System.out.println(arm);
			}
		}
	}

}
