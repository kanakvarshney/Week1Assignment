//10. Write a java program to get shallow copy of a hashMap instance
package Lp.week1.assignment;

import java.util.HashMap;
//import org.apache.log4j.Logger;
import java.util.Scanner;

public class HashMapShallow {
	
	//static Logger logger = Logger.getLogger(HashMapShallow.class);
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfInputs=sc.nextInt();  //to enter how many entries want in hashMap
	
		HashMap<Integer,String> hashMap= new HashMap<>();
		
		for(int i=0; i<noOfInputs; i++) {
		     Integer a= sc.nextInt();        // take key input as integer
		     String b= sc.next();            // take value input as a string
		     hashMap.put(a,b);
		}
		
		System.out.println("Origianl HashMap is :" + hashMap); 
		
		HashMap<Integer,String> newHashMap;
		newHashMap= (HashMap)hashMap.clone();
		
		System.out.println("Shallow Copy of HashMap is:" + newHashMap);
	}

}
