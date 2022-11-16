import java.util.Scanner;

class Employee{
	
	String name;
	int age;
	String Phone;
	String Address;
	double Salary;
	
	void PrintSalary(){
		System.out.println("Salary= "+Salary);
	}
	
	Employee(String name,int age,String Phone,String Address,double Salary){
		
		this.name=name;
		this.age=age;
		this.Phone=Phone;
		this.Address=Address;
		this.Salary=Salary;
	}
	
	void DisplayEmployee(){
		
		system.out.println();
		
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Phone= "+Phone);
		System.out.println("Address= "+Address);
		System.out.println("Salary= "+Salary);
		System.out.println();		
		
	}	
}

class Officer extends Employee{
	
	String Specialization;
	
	Officer(String name,int age,String Phone,String Address,double Salary,String Specialization){
		
		super(name,age,Phone,Address,Salary);
		this.Specialization=Specialization;	
	}
	
	void DisplayOfficer(){

		DisplayEmployee();
		System.out.println("Specialization= "+Specialization);
	}	
}

class Manager extends Employee{
	
	String Department;
	
	Manager(String name,int age,String Phone,String Address,double Salary,String Department){
	
		super(name,age,Phone,Address,Salary);
		this.Department=Department;
	}
	
	void DisplayManager(){
		DisplayEmployee();
		System.out.println("Department= "+Department);
		
	}	
}

class Emp{
		public static void main(String[] args) {

			Scanner r=new Scanner(System.in);

			System.out.println();
			System.out.println("Select your Choice");
			System.out.println("For Defining the Object for the particular Choice");
			

			while (true){
				System.out.println("1.Employee");
				System.out.println("2.Manager");
				System.out.println("3.Officer");
				System.out.println("4.Exit");
				System.out.println();

				System.out.print("Enter your Choice: ");
				int choice=r.nextInt();
				
				if (choice==1 || choice==2 || choice==3){
				
					System.out.println("Enter the Employee Details");
					System.out.println();

					System.out.print("Enter your Name: ");
					r.nextLine();	//Flushing out Newline Character
					String name=r.nextLine();

					System.out.print("Enter your Age: ");
					int age=r.nextInt();

					System.out.print("Enter your Phone Number: ");
					r.nextLine();
					String phone=r.nextLine();

					System.out.print("Enter your Address: ");
					String addr=r.nextLine();

					System.out.print("Enter your Salary: ");
					int sal=r.nextInt();
				
				

					if (choice==1){

						Employee e=new Employee(name, age, phone, addr, sal);
						e.DisplayEmployee();
					}

					else if (choice==2){

						System.out.print("Enter your Specialization: ");
						r.nextLine();
						String spec=r.nextLine();

						Manager m=new Manager(name, age, phone, addr, sal, spec);
						m.DisplayManager();
						System.out.println();
					}

					else if (choice==3){

						System.out.print("Enter your Department: ");
						r.nextLine();
						String spec=r.nextLine();

						Officer o=new Officer(name, age, phone, addr, sal,spec);
						o.DisplayOfficer();
						System.out.println();
					}
				
				}

				else if (choice==4){
					break;
				}

				else{
					System.out.println("Invalid Choice!");
					System.out.println();
				}

			} //While
		}//psvm
}//class

