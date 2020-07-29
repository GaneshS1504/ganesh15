package customerinterface;
import com.arwizon.Model.Customer;



public class Implementsinterface implements Interface {
	Customer c=new Customer();
	public Customer Addcustomer(String name,int PhoneNo,String account_type)
	{
		 c.setName(name);
	     c.setPhoneNo(PhoneNo);
	     c.setAccount_type(account_type);
	     c.setCustomerId(Customer.getCount());
	     return c;
	}
}

