package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class MoreArrayFun {
	
	static String[] stringArray = new String[7];
	static Random ran = new Random();
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		stringArray[0]="0";
		stringArray[1]="1";
		stringArray[2]="2";
		stringArray[3]="3";
		stringArray[4]="4";
		stringArray[5]="5";
		stringArray[6]="6";
		
		first(stringArray);
		System.out.println("\n");
		second(stringArray);
		System.out.println("\n");
		third(stringArray);
		
		for(int i =0; i<3;i++) {
			fourth(stringArray);
			System.out.println("/n");
		}
	}	
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void first(String[] arrae) {
		for(int i = 0; i<arrae.length; i++) {
			System.out.println(arrae[i]);
		}
	}
	
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void second(String[] arrae) {
		for(int i = arrae.length-1;i>=0; i--) {
			System.out.println(arrae[i]);
		}
	}
	
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
	void third(String[] arrae) {
		for(int i =0; i<arrae.length; i++) {
			if(i%2==0) {
			System.out.println(arrae[i]);
			}
		}
	}
	
	 //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void fourth(String[] arrae) {
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrae));
		while(list.size()>0) {
			
			
			
			int rand=ran.nextInt(list.size());
			System.out.println(list.get(rand));
			list.remove(rand);
			
		}
	}
	
	
	
}
