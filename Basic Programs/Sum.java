import java.util.Scanner;

class Sum{

	public static void main(String[] args){
	
		Scanner reader=new Scanner(System.in);
	
		System.out.print("Enter the 1st number: ");
		int a1=reader.nextInt();
	
		System.out.print("Enter the 2nd number: ");
		int a2=reader.nextInt();
		
		int sum=a1+a2;
	
		System.out.println("The sum of the 2 number is "+ sum);
	}
	
}
