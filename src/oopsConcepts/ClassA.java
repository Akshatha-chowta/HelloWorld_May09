package oopsConcepts;

public class ClassA {
	public int Salary;
	public String Name;
	public String Orgname;
	
	public ClassA() {
		System.out.println("--Inside the default constructor--");
		System.out.println("\n");
		
	}
	public ClassA(int val1,String val2,String val3)
	{
		this.Salary=val1;
		this.Name=val2;
		this.Orgname=val3;
		System.out.println("\n");
		System.out.println("--Inside the Prameterized constructor--");
		System.out.println("Salary="+val1 +" "+" Name="+val2 +" " +"Orgname="+ val3);
	}
	
	public void Display()
	{
		System.out.println("Name of the Emp:"+Name);
		System.out.println("Name of the Org:"+Orgname);
		System.out.println("Salary of the Emp:"+Salary);
	}

}
