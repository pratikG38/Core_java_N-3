package org.tnsif.GenericDemo;
//Program to demonstrate on Generic class
//Generic class Definition
class GenericClass<T>
{
	T x;
	//
	void display(T x)
	{
		this.x=x;
	}
	//to return the elements
	T accept()
	{
		return x;
	}
}


//Driver class
public class GenericsClassDemo {

	public static void main(String[] args) {
		GenericClass<String>obj1=new GenericClass<>();
		obj1.display("HCL");
		
		System.out.println(obj1.accept());
	}

}
