import java.util.Scanner;

class roots{
	
	public static void main(String[] args){
	
		Scanner r=new Scanner(System.in);
		
		System.out.print("Enter the coefficient of 'a': ");
		double a=r.nextDouble();
		System.out.println();
		
		System.out.print("Enter the coefficient of 'b': ");
		double b=r.nextDouble();
		System.out.println();
		
		System.out.print("Enter the coefficient of 'c': ");
		double c=r.nextDouble();
		System.out.println();
			
		
		double D=Math.pow(b,2)-(4*a*c);
		
		if (D>0){
		
		
			double x1,x2;
			
			x1=(-b+Math.sqrt(D))/(2*a);
			x2=(-b-Math.sqrt(D))/(2*a);
			
			
			System.out.println("The 2 roots of the equation are "+x1+" and "+x2);
			
		
		}
		
		
		else if (D==0){
		
			double x;
			
			x=(-b/(2.0*a));
			
			System.out.println("The 2 roots of the equation are "+x);
		
		
		}
		
		
		else{
		
			double real,xi;
			
			real=-b/(2.0*a);
			
			
			xi=(Math.sqrt(-D)/(2*a));
			
			
			System.out.println("The 1st complex root: "+real+" +i "+xi);
			System.out.println("The 2nd complex root: "+real+" -i "+xi);
 
		
		}
	
	}
	
	
	
	
	
	
	
}

