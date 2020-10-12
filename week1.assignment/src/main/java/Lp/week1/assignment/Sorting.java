//
package Lp.week1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer  {
    private String custname;
    private int custage;

    public Customer(int custage, String custname) {
        this.custage = custage;
        this.custname = custname;
 
    }

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustage() {
		return custage;
	}

	public void setCustage(int custage) {
		this.custage = custage;
	}
    
	static Comparator<Customer> custNameComparator = new Comparator<Customer>() {

		public int compare(Customer c1, Customer c2) {
		   
		   String CustomerName1 = c1.getCustname().toUpperCase();
		   String CustomerName2 = c2.getCustname().toUpperCase();
           //ascending order
		   return CustomerName1.compareTo(CustomerName2);

		   
	    }
	};
	
	public static Comparator<Customer> custAgeComparator = new Comparator<Customer>() {

		public int compare(Customer c1, Customer c2) {

		   int age1 = c1.getCustage();
		   int age2 = c2.getCustage();
           //For ascending order
		   return age1-age2;
		}
	};
	
	@Override
	   public String toString() {
	       return "[ custage=" + custage + ", custname=" + custname  + "]";
	   }

}
public class Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> list= new ArrayList<Customer>();
		
		list.add(new Customer(24, "kanak"));
		list.add(new Customer(26, "rahul"));
		list.add(new Customer(21, "nikhil"));
		list.add(new Customer(28, "kishore"));
		list.add(new Customer(20, "rajneesh"));
		
		System.out.println("After Sorting By Age list is:");
		   
		Collections.sort(list, Customer.custAgeComparator);
		   for(Customer ctr: list){
				System.out.println(ctr);
		   }
		   
		System.out.println("After Sorting By name list is:");
		   
		 Collections.sort(list, Customer.custNameComparator);
            for(Customer ctr: list){
				System.out.println(ctr);
		   }
	}
	

}
