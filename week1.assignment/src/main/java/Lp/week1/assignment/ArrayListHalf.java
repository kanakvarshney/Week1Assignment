//15.  Write a program to sort a first half of the list as ascending formation, and remaining half in descending formation.
package Lp.week1.assignment;
import java.util.*;
public class ArrayListHalf {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		for(int i=0; i<size; i++) {
			Integer data=sc.nextInt();
			l.add(data);
		}
		
		System.out.println("Before Sorting array list:");
		for(Integer al: l) {
			System.out.println(al);
		}
		
		 Collections.sort(l.subList(0,size/2));
	     Collections.sort((l.subList(size/2, size)),Collections.reverseOrder());
		  
	     System.out.println("After Sorting array list:"); 
	     for(Integer al: l) {
				System.out.println(al);
			}
	}

}
