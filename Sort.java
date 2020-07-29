
import java.util.Scanner;
public class Sort {
	public static void main(String[] Args)
	{
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			System.out.println("enter arr value");
			arr[i]=sc.nextInt();
		}
		sort(arr);
	}
	
	public static void sort(int arr[])
	{
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				if(arr[j]>=arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int t:arr)
		{
			System.out.println(t);
		}
		
	}

}
