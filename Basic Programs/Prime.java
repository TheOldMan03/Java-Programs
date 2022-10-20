import java.util.Scanner;

class Prime{
	
	public static void main(String[] args){
	
		Scanner reader=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=reader.nextInt();
		
		int i,flag=0;
		
		for (i=2;i<=n/2;i++){
		
			if (n%i==0){
				flag=1;
				break;
			}
		}
		
		if (flag==0)
			System.out.println("The given number"+n+" is prime");
		
		else 
			System.out.println("The given number"+n+" is not prime");
		
	}	
}
