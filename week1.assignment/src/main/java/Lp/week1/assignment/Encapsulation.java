//8. Develop a program to showcase data hiding and encapsulation.
package Lp.week1.assignment;

import java.util.Scanner;

class CustomerAccount{
	private long accountNo;
	private String email;
	private String name;
	private float  amount;
	
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
public class Encapsulation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CustomerAccount ca= new CustomerAccount();
		
		//Enter AccountNo
		long accountNo=sc.nextLong();
		ca.setAccountNo(accountNo);
		//Enter Name
		String name=sc.next();
		ca.setName(name);
		//Enter Email
		String email=sc.next();
		ca.setEmail(email);
		//Enter Amount
		float amount=sc.nextFloat();
		ca.setAmount(amount);
		
		System.out.println(ca.getName()+" "+ca.getAccountNo()+" "+ca.getEmail()+" "+ca.getAmount());
		
		/*ca.setAccountNo(8977394);
		ca.setName("kanak");
		ca.setEmail("kanakvarshney@21");
		ca.setAmount(5000);*/
		
		
		
	}

}
