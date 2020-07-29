package com.arwizon.Model;

//import java.util.Scanner;

public class Customer {
	
static int  count=101;
	private String name;
	private int PhoneNo;
	private int Customer_ID;
	private String account_type;
	
	public Customer()
	{
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public void setCustomerId(int Customer_ID)
	{
		this.Customer_ID=Customer_ID;
	}
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return this.name;
		
	}
	public void setPhoneNo(int PhoneNo)
	{
		this.PhoneNo=PhoneNo;
		
	}
	public  void setAccount_type(String account_type)
	{
		this.account_type=account_type;
		
	}
	public String toString()
	{
		return "Customer Name"+":"+this.name+" "+"PhoneNo:"+this.PhoneNo+" "+"account_type:"+this.account_type+" "+"Customer_ID:"+this.Customer_ID;
		
	}
}
