/*Develop a program to calculate taxable amount for an given employee. The input for the program is the total salary of the employee. The program should take care all the tax components like
-First 1.5 lakhs- No  tax
-1.5 -10 lakhs , 10%tax
10-15 lakhs, 20% tax
15-30 lakhs, 35% tax
-more than 40 lakhs, 40%tax
-And for Female employees standard 2000r deduction in the final tax amount.
The amount displayed should have 2 decimal precision*/
package Lp.week1.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

class Calculator {
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	private double salary;
	private String gender;
	
	
	public Calculator(double salary, String gender)
	{
		this.salary=salary;
		this.gender=gender;
	}


	public void tax() {
		double taxAmount=0;
		if(salary<150000) {
			
			taxAmount=0;
		}
		else if(salary>=150000 && salary<1000000){
			
			taxAmount=((10.0/100)*salary);
		}
		else if(salary>=1000000 && salary< 1500000) {
			
			taxAmount=((20.0/100)*salary);
		}
		else if(salary>=1500000 && salary<3000000) {
			
			taxAmount= ((35.0/100)*salary);
		}
		else {
			
			taxAmount= ((40.0/100)*salary);
		}
		
        df.format(taxAmount);
	    
		if(gender.equals("female")) {
			
			taxAmount= taxAmount - 2000;
		}
		
		System.out.println("taxable amount on given salary is:"+ taxAmount);
		
	}
	
}
public class CalculateTax {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double salary=sc.nextDouble();
		System.out.println("Enter gender");
		String str=sc.next();
	
        
		Calculator c= new Calculator(salary,str);
		c.tax();
		
		
		
	}

}
