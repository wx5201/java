import java.io.*;
public class Employee{
	public String name;//ʵ��������������ɼ�
	private double salary;//˽�б��������ڸ���ɼ�
	//�ڹ������ж�name��ֵ
	public Employee(String empName){
		name=empName;
}
	//�趨salary��ֵ
	public void setSalary(double empSal){
		salary=empSal;
}

	//��ӡ��Ϣ
	public void printEmp(){
		System.out.println("���� �� " + name);
		System.out.println("нˮ �� " + salary);
	}
	
	public static void main(String [] args){
		//�������� empone
		Employee empone = new Employee("RUBB");
		//���÷���etSalary ,printEmp
		empone.setSalary(1000);
		empone.printEmp();

		}
}  