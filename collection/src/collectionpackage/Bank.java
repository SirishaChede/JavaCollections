package collectionpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Bank{
	 static Map<String, Customer> customerMap = new HashMap<>();
	 public static void main(String[] args) {
	        // Add some customers to the map
	        addCustomer(new Customer("12345", "John Doe", "9876543210"));
	        addCustomer(new Customer("67890", "Jane Smith", "9123456789"));
	        addCustomer(new Customer("11223", "Alice Brown", "9988776655"));

	        
	        String accountNumber = "12345";
	        retrieveCustomer(accountNumber);

	        
	        accountNumber = "67890";
	        retrieveCustomer(accountNumber);

	        // Example of a non-existing account number
	        accountNumber = "99999";
	        retrieveCustomer(accountNumber);
	    }

	    // Method to add a customer to the map
	    public static void addCustomer(Customer customer) {
	        
				customerMap.put(customer.getAccountnumber(), customer);
			
			
	        System.out.println("Customer added: " + customer);
	    }

	    // Method to retrieve customer details by account number
	    public static void retrieveCustomer(String accountNumber) {
	        Customer customer = customerMap.get(accountNumber);
	        if (customer != null) {
	            System.out.println("Account Number: " + accountNumber);
	            System.out.println("Name: " + customer.getName());
	            System.out.println("Mobile Number: " + customer.getMobilenumber());
	        } else {
	            System.out.println("Account not found for account number: " + accountNumber);
	        }
	    }
	}



 class Customer {
	public String name;
	public String accountnumber;
	public String mobilenumber;
	public Customer(String name, String accountnumber, String mobilenumber) {
		super();
		this.name = name;
		this.accountnumber = accountnumber;
		this.mobilenumber = mobilenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "CollectionBanking [name=" + name + ", accountnumber=" + accountnumber + ", moilenumber=" + mobilenumber
				+ "]";
	}
	
	
	
}
