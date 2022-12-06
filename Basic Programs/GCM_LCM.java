import java.util.Scanner;

class GCD_LCM{

	public static void main(String[] args){

		Scanner reader=new Scanner(System.in);
	
		System.out.print("Enter the 1st number: ");
		int a=reader.nextInt();
		System.out.println();

		System.out.print("Enter the 2nd number: ");
		int b=reader.nextInt();
		System.out.println();


		int i,lcm;
		
				
		while (a%b!=0){
			b=a%b;
			a=b;
		}
		
		
		//hcf*lcm=a*b
		//lcm=(a*b)/(hcf)
		
		lcm=(a*b)/
		
		
		
		
		
		
		System.out.println("The HCF and LCF of the 2 numbers: are "+b+" and"+lcm);
		
	
	}
	
	
}
	






