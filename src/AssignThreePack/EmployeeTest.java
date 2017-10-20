package AssignThreePack;


import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		ConsoleHandler console= new ConsoleHandler(); 
		//console.getTerminal().setBackgroundColor("WHITE");
		Scanner read= new Scanner (System.in);
		int input;
		do 
		{
			System.out.println("\n\n\tWhat you like to do?");
			System.out.println("Pleasse Enter 1-4 or 0 for exit");
			System.out.println("1. Show Entire Info");
			System.out.println("2. Show Employee info ");
			System.out.println("3. Show Manager info");
			System.out.println("4. Show Executive");		
			System.out.println("0. Exit");
			input=read.nextInt();
		if(input==1) 
		{
			Employee emp=new Employee("Anupom ",4600);
			System.out.println(emp.toString());
			Manager newManager=new Manager("James",8000,"Soft Dept");
			System.out.println(newManager.toString());
			Executive excu=new Executive("Aron",7000,"HR",500);
			System.out.println(excu.toString());
		}
		else if(input==2) 
		{
			Employee emp=new Employee("Anupom ",4600);
			System.out.println(emp.toString());
		}
		else if(input==3) 
		{
			Manager newManager=new Manager("James",8000,"Soft Dept");
			System.out.println(newManager.toString());
		}
		else if(input==4) 
		{
			Executive excu=new Executive("Aron",7000,"HR",500);
			System.out.println(excu.toString());
		}else if(input==0) 
		{
			
			System.out.println("Bye Bye");
			System.exit(1);
		}
		else
			{
			System.out.println("In valide Choice");
			System.out.println("Pleasse Enter 1 to 4");
			}
		}while(input!=0);
		
	}

}
