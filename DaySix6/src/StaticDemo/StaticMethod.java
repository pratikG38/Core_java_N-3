package StaticDemo;
//program to demonstrate on static method
public class StaticMethod {
	
	//data members
	private static double salary=7888885.67;
	//static method
	public static void display()
	{
		System.out.println("Salary is: "+salary);
	}
	//getters and setters method
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
