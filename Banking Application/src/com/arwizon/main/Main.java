package com.arwizon.main;
import java.util.Scanner;
import com.arwizon.Model.Customer;
import customerinterface.Implementsinterface;

public class Main {
	static int ch;
	public static void main(String[] Args)
	{
		System.out.println("press 1 to  add customer  data");
		System.out.println("press 2 to display customer data");
		System.out.println("press 3 to search  data");
	///	System.out.println("press 3 to delete customer data");
		System.out.println("press 4 to exit");
		
		Scanner data=new Scanner(System.in);
	    System.out.println("enter how many customer data you want to enter");
        int n=data.nextInt();
        Customer[] arr=new Customer[n];
	   
	   
		while(true)
		{
			
			Scanner read=new Scanner(System.in);
			System.out.println("enter your choice");
			ch=read.nextInt();
			switch(ch)
			{
			      
			case 1:
				 
				        System.out.println("enter user name");
				        String name=read.next();
				        System.out.println("enter PhoneNo name");
				        int PhoneNo=read.nextInt();
				        System.out.println("enter account_type name");
				        String account_type=read.next();
				        Implementsinterface c=new Implementsinterface();
				        Customer c1=c.Addcustomer(name,PhoneNo,account_type);
				        for(int i=0;i<arr.length;i++)
				        {
				        	if(arr[i]==null)
				        	{
				        		arr[i]=c1;
				        		break;
				        	}
				        }
				    
				
			  break;
				
			
			case 2:
				
				
				for(Customer i:arr)
				{
			         System.out.println(i);
				}
			  break;
			  
			case 3:
				System.out.println("enter customer name to search");
				String Name=read.next();
				int flag=1;
				for (int i=0;i<arr.length;i++)
				{
					if(Name.equals(arr[i].getName()))
							{
						            System.out.println(arr[i]);
							}
					else
					{
						flag=0;
					}
				}
				if(flag==0)
				{
					System.out.println("data not found");
				}
				
				break;
				
			
		    case 4:
	           System.exit(1);
	           
			
			}
			
		}
		
	}
}
