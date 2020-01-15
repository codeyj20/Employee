// Jameeyah Cody
// 1/14/2020
// Employee class

public class Employee
{

  // Private Employee variables
  private String first_name;
  private String last_name;
  private double monthly_salary;

 
  // Default Constructor
  public Employee()
  {
    this.first_name = "";
    this.last_name = "";
    this.monthly_salary = 0.0;
  }
  
   // Constructor with parameters
  public Employee(String first_name, String last_name, double monthly_salary)
  {
    this.first_name = first_name;
    this.last_name = last_name;
    this.monthly_salary = monthly_salary;
  }
 
  // This function sets the first name
  public void setFirstName(String first_name)
  {
    this.first_name = first_name;
  }
 
  // This function gets the first name
  public String getFirstName()
  {
    return first_name;
  }

  // This function sets the last name
  public void setLastName(String last_name)
  {
    this.last_name = last_name;
  }
 
  // This function gets the last name
  public String getLastName()
  {
    return last_name;
  }
 
  // This function sets the monthly salary
  public void setMonthlySalary(double monthly_salary)
  {
    // If the monthly salary is not positive, do not set its value.
    if(monthly_salary > 0)
      this.monthly_salary = monthly_salary;
  }

  // This function gets the monthly salary
  public double getMonthlySalary()
  {
    return monthly_salary;
  }

}
 