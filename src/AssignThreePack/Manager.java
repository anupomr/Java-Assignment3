package AssignThreePack;

public class Manager extends Employee
{
	private String dept;
	
	public Manager(String name, double salary,String dept) 
	{
		super(name, salary);
		this.dept=dept;
		
	}
	String getDept()
	{
		return dept;
	}
	
	public String toString()
	{
		String print=super.toString()+
				  "\nThis Manager manages "+dept+ " Depertment";
		return  print;
	}

}
