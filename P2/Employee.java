import java.io.*;
import java.util.Scanner;

class Employee{

	int salary,age;
	long phone_num;
	String name,adress;
	
	Scanner Obj=new Scanner(System.in);
	
	void GetDetails(){
	
		System.out.print("Enter the name of the employee: ");
		name=Obj.nextLine();
		
		System.out.print("Enter the age  of the employee: ");
		age=Obj.nextInt();
		
		System.out.print("Enter the PhoneNumber of the employee: ");
		phone_num=Obj.nextLong();
		
		System.out.print("Enter the adress of the employee: ");
		adress=Obj.nextLine();
		
		System.out.print("Enter the Salary of the employee: ");
		salary=Obj.nextInt();
		
		System.out.println();
		
	}
	
	void PrintDetails(){
	
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phone_num);
		System.out.println("Address: "+adress);
	}
	
	void PrintSalary(){
		System.out.println("Salary: "+salary);
	}
	
	
	public static void main(String[] args){
	
		Officer O=new Officer();
		Manager m=new Manager();
		O.GetDetails();
		M.GetDetails();
		O.PrintDetails();
		O.PrintSalary();
		M.PrintDetails();
		M.PrintSalary();
	}	
}


class Officer extends Employee{

	String Specialization;
}

class Manager extends Employee{

	String Department;
}






