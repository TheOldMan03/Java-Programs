/*write a java program which creates a class named employee having the following members 

Name,age,phone number address and salary it also has a method called NamePrintSalary which prints the salry of the employee

2 classes officer and manager inherits the employee class 

the officer and manager class have data members: Specialisation and Department respectively

Now assign name,age,phone number adress and salary to an officer and a manager by making an object of both these classes and print the same */


class Employee{

    String Name;
    int age;
    int phone_num;
    int salary;

}

class Officer extends Employee{
    String Specialisation;
    String Department;
}

class Manager extends Employee{
    String Specialisation;
    String Department;
}