import java.io.*;
import java.util.Scanner;

class Employee{
	
	String name;
	int age;
	String Phone;
	String Address;
	double Salary;
	
	void PrintSalary()
		System.out.println("Salary= "+salary);
	
	Employee(String name,int age,String Phone,String Address,double Salary){
		
		this.name=name;
		this.age=age;
		this.Phone=Phone;
		this.Address=Address;
		this.Salary=Salary;
	}
	
	void PrintDetails(){
		
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Phone= "+Phone);
		System.out.println("Address= "+Adress);
		System.out.println("Salary= "+Salary);		
		
	}	
}

class Manager extends Employee{
	
	String Specialization;
	String Department;
	
	Manager(String Name,int age,String Phone,String Address,double Salary,String Specialization,String Department){
	
		super(name,age,Phone,Address,Salary);
		this.Specialization=Specialization;
		this.Department=Department;
	}
	
	void DisplayManager(){
		DisplayEmployee();
		System.out.println("Specialization= "+Specialization);
		System.out.println("Department= "+Department);
		
	}	
}

class Officer extends Employee{
	
	String Specialization;
	String Department;
	
	Officer(String name,int age,String Phone,String Address,double Salary,String Specialization,String Department){
		
		super(name,age,Phone,Address,Salary);
		this.Specialization=Specialization;
		this.Department=Department;	
	}
	
	void DisplayOfficer(){
		displayEmployee();
		System.out.println("Specialization= "+Specialization);
		System.out.println("Department= "+Department);
	}	
}

class Test{
	
	public static void main(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Manager Details");
		
		System.out.print("Name: ");
		String name=sc.nextLine();
		
		System.out.print("Age: ");
		int age=sc.nextInt();
		
		System.out.print("Phone Number: ");
		String Phone=sc.nextLine();
		
		System.out.print("Address: ");
		String Address=sc.nextLine();
		
		System.out.print("Salary: ");
		double Salary=sc.nextDouble();
		
		System.out.print("Department: ");
		String Department=sc.nextLine();
		
		System.out.print("Specialization: ");
		String Specialization=sc.nextLine();
		
		Manager m=new Manager(name,age,Phone,Address,Salary,Specialization,department);
		m.DisplayManager();
		
		
		System.out.print("Enter the Manager Details");
		
		System.out.print("Name: ");
		String name=sc.nextLine();
		
		System.out.print("Age: ");
		int age=sc.nextInt();
		
		System.out.print("Phone Number: ");
		String Phone=sc.nextLine();
		
		System.out.print("Address: ");
		String Address=sc.nextLine();
		
		System.out.print("Salary: ");
		double Salary=sc.nextDouble();
		
		System.out.print("Department: ");
		String Department=sc.nextLine();
		
		System.out.print("Specialization: ");
		String Specialization=sc.nextLine();
		
		Officer o=new Officer(name,age,Phone,Address,Salary,Specialization,department);
		o.DisplayOfficer();		
	}
}
