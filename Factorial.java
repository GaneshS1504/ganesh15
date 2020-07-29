import java.util.Scanner;

public class Factorial {
	public static void main(String[] Args)
	{
		find_factorial();
	}
	
	public static void find_factorial()
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int prod=1;
		while(n!=0)
		{
			prod*=n;
			n--;
		}
		
		System.out.println(prod);

	}

}

