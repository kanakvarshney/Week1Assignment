//12. Write a java program to get collection a collection view of the values contained in the map
package Lp.week1.assignment;
import java.util.*;
public class MapCollectionView {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputs=sc.nextInt();  //to enter how many entries want in hashMap
		Map<Integer,String> map= new HashMap<>();
		
		for(int i=0; i<inputs; i++) {
		     Integer a= sc.nextInt();        // take key input as integer
		     String b= sc.next();            // take value input as a string
		     map.put(a,b);
		}
		
		System.out.println("Collection view of HashMap is :" +map.values()); 
	}
}
