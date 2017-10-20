package AssignThreePack;

public class Employee 
{

	private String name;
	private double salary ;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary=salary;
					
	}
	
	String getName()
	{
		return name;
	}
	
	
	double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		String print="\nThe Name of Employee is : "+name+
					 "\nThe Salary of "+name+ " is "+salary;
		return  print;
	}
		


}
