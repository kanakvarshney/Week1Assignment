//11.  Write a java program to test if a map contains a mapping for the specified key
package Lp.week1.assignment;
import java.util.*;
import java.util.Map.Entry;
public class MapSpecifiedKey {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputs=sc.nextInt();  //to enter how many entries want in hashMap
		HashMap<Integer,String> hashMap= new HashMap<>();
		
		for(int i=0; i<inputs; i++) {
		     Integer a= sc.nextInt();        // take key input as integer
		     String b= sc.next();            // take value input as a string
		     hashMap.put(a,b);
		}
		
		System.out.println("Origianl HashMap is :" + hashMap); 
		
		System.out.println("Enter a key to check whether it contains mapping or not");
	
		int searchKey= sc.nextInt();
		boolean keyPresent=false;
		Iterator<Entry<Integer, String>> itr=  hashMap.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			
			if(searchKey==entry.getKey()) {
				keyPresent=true;
			}
			
		}
		System.out.println("Is map contains mapping for the specified Key:" + keyPresent);
		
	}

}
