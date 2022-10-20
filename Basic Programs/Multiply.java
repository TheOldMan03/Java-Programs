import java.util.Scanner;

class multiply{
	
	public static void main(String[] args){
		
		Scanner reader=new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		float n1=reader.nextFloat();
		System.out.println();
		
		
		System.out.print("Enter the 2nd Number : ");
		float n2=reader.nextFloat();
		System.out.println();
		
		
		float prod=n1*n2;
		
		
		System.out.println("The product of the 2 numbers is : "+prod);
		
	}
	
}
