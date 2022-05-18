package com.collections;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
	Set<Integer> s = new HashSet<>();
	s.add(1);
	s.add(3);
	s.add(6);
	s.add(10);
	s.add(9);
	s.add(10);
	for(int i =0 ; i<=10; i++) {
		if(s.contains(i)) {
			System.out.println(i + "number founded");
		}else
		{
			System.out.println( i + "Number not found ");
		}
		
		
		
	}
	
   System.out.println("By removing all values of sets :");
    System.out.println(s.removeAll(s));
    System.out.println("Checking if set is empty : ");
    System.out.println(s.isEmpty());
    System.out.println("The Size of set is :" + s.size());
   // System.out.println("By retaining all the elements : " + s.re);
    
}
}