import java.io.*;
public class Employee{
	public String name;//实例变量对于子类可见
	private double salary;//私有变量，仅在该类可见
	//在构造器中对name赋值
	public Employee(String empName){
		name=empName;
}
	//设定salary的值
	public void setSalary(double empSal){
		salary=empSal;
}

	//打印信息
	public void printEmp(){
		System.out.println("名字 ： " + name);
		System.out.println("薪水 ： " + salary);
	}
	
	public static void main(String [] args){
		//创建对象 empone
		Employee empone = new Employee("RUBB");
		//调用方法etSalary ,printEmp
		empone.setSalary(1000);
		empone.printEmp();

		}
}  