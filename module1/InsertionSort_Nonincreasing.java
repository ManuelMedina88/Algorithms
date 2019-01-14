package module1;

public class InsertionSort_Nonincreasing {
	public static void main(String args[]){
	
		int A[] = {5, 2, 4, 6, 1, 3};
		System.out.print("Input ");
		show(A);
		
		for ( int j = A.length - 2; j >= 0; j-- ){
			int k = j;
			for (int i = k + 1; i < A.length; i++){
				if((A[k] < A[i])){
					int temp = A[i];
					A[i] = A[k];
					A[k++] = temp;
				}
				else 
					break;
					
			}
		}
		System.out.print("Output ");	
		show(A);
	}
	
	public static void show(int[] b){
		System.out.print("A = { ");
		for(int i = 0; i < b.length; i++){
			System.out.printf("%d", b[i]);
			if(i < (b.length - 1) )
				System.out.print(", ");
		}
		System.out.println(" }");	
	}
}
