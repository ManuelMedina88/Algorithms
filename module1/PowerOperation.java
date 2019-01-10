package module1;

public class PowerOperation {

	public static void main(String[] args){
	
		int numBase =2;
		
		int exp = 16;
		
		int result = 1;
		
		while(exp > 0){
			result = result * numBase;
			exp--;
		}
		
		System.out.println("Result is "+ result);
	}
}
