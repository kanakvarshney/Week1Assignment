package Lp.week1.assignment;
import java.util.Scanner;

public class ScientificCalculation {
	
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
	    
	  //Enter value to be calculated	
		double value= sc.nextDouble();
	  //Enter choice what to calculate
	      String str= sc.next();
	
	     switch(str){
	
		    case "tan":
			    System.out.println("Tangent of value is:"+ Math.tan(value));
			    break;
		    case "sin":
			    System.out.println("Sine of value is:" + Math.sin(value));
			    break;
		    case "cos":
			    System.out.println("Cosine of value is:" + Math.cos(value));
			    break;
		    case "square_root":
			   System.out.println("Square root of value is:" + Math.sqrt(value));
			   break;
		    case "cube_root":
			    System.out.println("Cube root of value is:" + Math.cbrt(value));
			    break;
		    case "log":
			    System.out.println("Square root of value is:" + Math.log(value));
			    break;
			default:
				System.out.println("No match found");
	     }
	}

}
