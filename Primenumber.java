package week1.day2;

public class Primenumber {
	
	public static void main(String[] args) {
		
	
	
	//Declare an int Input and assign a value 13
	
	int input = 13;
	
// Declare a boolean variable flag as false
	
	boolean flag = false;
	
	//Divide the input with each for loop variable and check the remainder

 for (int i = 2; i < input/2; i++) 
 //i{
	 
	 if (input%i==0) {
		 
		 // 13%2
		 //13%1==0
		 
		 //12/2
		 
		 flag =true;
		break;
	}
	
	 if (!flag) {
		 
		 System.out.println(input+ "is a PrimeNumber");
		
	}
	 else {
		System.out.println(input+ "is not a PrimeNumber");
	}
}
	
	

}
