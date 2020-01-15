// Jameeyah Cody
// 1/14/2020
// Employee driver

import java.util.Scanner;

public class EmployeeTest
{
  public static void main(String [] args)
  {
    String firstname = "", lastname = "";
    double salary = 0.0, raisedsalary = 0.0;
    
   
    Scanner input = new Scanner(System.in);
   
    Employee obj = new Employee(firstname, lastname, salary);
    
    
    // Enter first name
    System.out.print("Enter First Name: ");
    firstname = input.next();
    obj.setFirstName(firstname);

    // Enter last name
    System.out.print("Enter Last Name: ");
    lastname = input.next();
    obj.setLastName(lastname);

    // Enter salary
    System.out.print("Enter Salary: ");
    salary = input.nextDouble();
    obj.setMonthlySalary(salary);
   
   
    System.out.println();
    
    System.out.printf("Name: %s %s", obj.getFirstName(), obj.getLastName());
    System.out.println();
    System.out.printf("Salary: $%.2f", obj.getMonthlySalary());
    System.out.println();
    
    // Give the Employee a 10% raise and display the Employee’s yearly salary again.
    raisedsalary = obj.getMonthlySalary() + obj.getMonthlySalary() * 0.1;
    System.out.printf("Salary w/ raise: $%.2f", raisedsalary);
    System.out.println();
    
  }
}
