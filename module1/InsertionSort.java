package module1;

/* 					Insertion Sort Algorithm
 * 
 * this is my own version of insertion sort version 1.0
 * 
 * Keys => Output: A permutation(reordering) <a`1, a`2, ..., a`n> of the input 
 * sequence such that a`1 <= a`2 <= ... <= a`n. 
 */

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String args[]) {
		
		int keys[] = {5, 2, 4, 6, 1, 3, -5, -2, -1, 1, 4};
		
		System.out.print("Unordered array =");
		
		showArray(keys);
		
		insertionSort(keys);
		
		System.out.print("ordered array =");
		
		showArray(keys);
		
		
	}
	
	public static int[] insertionSort(int keys[]) {
		
		int a[] = keys;
		int temp = 0;
		
		for(int i = 1; i < a.length; i++) {
		
			int currentPosition = i;
		
			for(int j = (currentPosition - 1); j >= 0; j--) {	
			
				if(a[currentPosition] < a[j]) {
					temp = a[currentPosition];
					a[currentPosition] = a[j];
					a[j] = temp;
					currentPosition--;
				}
				else {
					break;
				}
			}
		}
		
		return a;
	}
	
	public static void showArray(int [] keys){
	
		System.out.print(" { ");
		
		for(int i = 0; i < keys.length; i++){
		
			System.out.print(keys[i]);
			
			if(i != keys.length - 1)
				System.out.print(", ");
		}
		
		System.out.println(" }\n");
	}
}
