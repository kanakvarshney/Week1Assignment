/*9. Develop a payment interface class with multiple abstract methods. Develop multiple child classes
that implements the above interface. And on top of it implement default method in parent interface*/
package Lp.week1.assignment;

import java.util.Scanner;

interface Payment{
	
	default void PaymentHoldername() {
		
		System.out.println("paymanet Holder name is Kanak Varshney");
		
	}
	public void discount(int x);
	public void modeOfPayment();
}
class CreditcardPayment implements Payment{
	
	public void modeOfPayment() {
		System.out.println("Payment mode is Card Payment i.e. Debit card and credit card");
	}
	public void discount(int x) {
		
		float taxableAmt= (float) (5.0/100*x);
		x=(int) (x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	
	}
}
class CashPayment implements Payment{
	
	public void modeOfPayment() {
		System.out.println("Payment mode Cash Payment");
	}
	public void discount(int x) {
		
		System.out.println("No discount available on cash payment therfore amount is:"+ x);
	
	}
}
class ApplicationPayment implements Payment{
	
	public void modeOfPayment() {
		System.out.println("Payment mode is Application Payment i.e. through Paypal, Paytm, Google pay");
	}
	public void discount(int x) {
		
		float taxableAmt= (float) (15.0/100*x);
		x=(int) (x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	
	}
}
class NetBankingPayment implements Payment{
	
	public void modeOfPayment() {
		System.out.println("Payment mode is Netbanking Payment");
	}
	public void discount(int x) {
		
		float taxableAmt= (float) (8.0/100*x);
		x=(int) (x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	
	}
}
public class TestPayment {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter payable amount");
		int x=sc.nextInt();
		
		Payment p=new CreditcardPayment();
		Payment p1=new CashPayment();
		Payment p2=new ApplicationPayment();
		Payment p3=new NetBankingPayment();
		
		p.PaymentHoldername();
		p.modeOfPayment();
		p.discount(x);
		
		p1.PaymentHoldername();
		p1.modeOfPayment();
		p1.discount(x);
		
		p2.PaymentHoldername();
		p2.modeOfPayment();
		p2.discount(x);
		
		p3.PaymentHoldername();
		p3.modeOfPayment();
		p3.discount(x);
	}

}
