import java.util.Scanner;

class EOO{

	public static void main(String[] args){
	
		Scanner reader=new Scanner(System.in);
	
	
		System.out.print("Enter a number : ");
		int n=reader.nextInt();
		
		if (n%2==0)
			System.out.println("The Number "+n+" is even");
		
		else 
			System.out.println("The number "+n+" is odd");
	
	}




}
