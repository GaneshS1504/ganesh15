public class Fibonacci {
public static void main(String[] args)
       {
    	   
    	   find_fibonacci();
       }
	
	   public static void find_fibonacci()
	   {
		     int a=0;
		     int b=1;
		     System.out.println(a);
	    	 System.out.println(b);
			 int r=0;
		   for(int i=2;i<10;i++)
		   {
			   r=a+b;
			   a=b;
			   b=r;
			   System.out.println(r);
		   }
	   }
}

