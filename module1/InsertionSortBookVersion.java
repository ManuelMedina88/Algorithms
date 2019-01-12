package module1;

/* 					Insertion Sort Algorithm
 * 
 * this is my own version of insertion sort version 1.0
 * 
 * Keys => Output: A permutation(reordering) <a`1, a`2, ..., a`n> of the input 
 * sequence such that a`1 <= a`2 <= ... <= a`n. 
 */


public class InsertionSortBookVersion {
	
	public static void main(String args[]) {
		
		int keys[] = {5, 2, 4, 6, 1, 3, -5, -2, -1, 1, 4};
		
		System.out.print("Unordered array =");
		
		showArray(keys);
		
		insertionSort(keys);
		
		System.out.print("ordered array =");
		
		showArray(keys);
		
		
	}
	
	public static int[] insertionSort(int keys[]) {
		
		for(int j = 1; j < keys.length; j++) {
		
			int key = keys[j];
			
			// Insert A[j] into the sorted sequence A[1 .. j - 1]
			
			int i = j - 1;
			
			while(i >= 0 && keys[i] > key){
			
				keys[i + 1] = keys[i];
				i -= 1;
			}
			
			keys[i + 1] = key;
		}
		
		return keys;
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
