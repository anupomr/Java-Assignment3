package AssignThreePack;

public class Executive extends Manager
{
	private double yearlyBonus;

	public Executive(String name, double salary,String dept,double yearlyBonus) 
	{
		super(name, salary,dept);
		this.yearlyBonus=yearlyBonus;
	}
	double getYearlyBonus()
	{
		return yearlyBonus;
	}
	public String toString()
	{
		String print=super.toString()+
				"\n This executive is entiteled to Yearly Bounus of"+yearlyBonus;
		return  print;
	}

}
