package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ClassA Emp = new ClassA();
		Emp.Name="Akshu";
		Emp.Salary=10000;
		Emp.Orgname="abc";
		Emp.Display();
		ClassA Emp1=new ClassA(20000,"Amrith","xyz");
		ClassB obj=new ClassB();
		obj.show();
		obj.Name="chippu";
		obj.Salary=40000;
		obj.Orgname="pqr";
		obj.Display();
		ClassC obj1=new ClassC();
		obj1.run();
	}

}
