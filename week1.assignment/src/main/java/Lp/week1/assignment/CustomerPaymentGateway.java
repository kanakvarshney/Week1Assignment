package Lp.week1.assignment;

import java.util.Scanner;
interface PaymentGateway1{
	
	void transferMoney(double transfMoney);
	
	
}
abstract class PaymentGateway implements PaymentGateway1{
	final double amount=50000;
	abstract void discount(double paymentAmount);
	public void transferMoney(double transfMoney) {
		
        if(transfMoney>amount) {
     	   System.out.print("Transfer is not allowed");
        }		
        else {
        	System.out.print("Transfer is done");
        }
	}
	
}
class CreditCard extends PaymentGateway{
	
	@Override
	void discount(double x) {
	
		float taxableAmt= (float) (5.0/100*x);
		x=(x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	}

	
}
class Wallet extends PaymentGateway{

	@Override
	void discount(double x) {
		
		float taxableAmt= (float) (10.0/100*x);
		x=(x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	}
}
class NetBanking extends PaymentGateway{

	@Override
	void discount(double x) {
		
		float taxableAmt= (float) (15.0/100*x);
		x= (x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	}
}
class UPI extends PaymentGateway{

	@Override
	void discount(double x) {
		
		float taxableAmt= (float) (12.0/100*x);
		x=(x-taxableAmt);
		System.out.println("After discount payment amount is:"+ x);
	}
}
public class CustomerPaymentGateway {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		PaymentGateway1 payment = new CreditCard();
		PaymentGateway payment0 = new CreditCard();
		
		PaymentGateway1 payment1 = new Wallet();
		PaymentGateway payment01 = new CreditCard();
		
		PaymentGateway1 payment2 = new NetBanking();
		PaymentGateway payment02 = new CreditCard();
		
		PaymentGateway1 payment3 = new UPI();
		PaymentGateway payment03 = new CreditCard();
		
		System.out.print("Enter payable amount");
		double amountPay=sc.nextDouble();
		System.out.print("Enter monry to transfer");
		double money=sc.nextDouble();
		System.out.println("1. Credit Card\n 2. Wallet\n 3. NetBanking\n 4.UPI  ");
		int choice=sc.nextInt();
		
		if(choice==1){
			
			payment0.discount(amountPay);
			payment.transferMoney(money);
		}
		else if(choice==2){
			
			payment01.discount(amountPay);
			payment1.transferMoney(money);
		}
		else if(choice==3){
			
			payment02.discount(amountPay);
			payment2.transferMoney(money);
		}
		else if(choice==4){
			
			payment03.discount(amountPay);
			payment3.transferMoney(money);
		}
	 
	}

}
