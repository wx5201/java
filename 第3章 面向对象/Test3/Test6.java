public class Test6{
	//定义变量
	public String name;
	public int age;
	//定义构造方法
	public Test6(){

		this("黎明",26);
	}

	//定义构造方法
	public Test6(String name,int age){
		this.name = name;
		this.age = age;
	}
	//定义方法
	public void say(){
		System.out.println("大家好，我叫"+ name +"，今年我"+ age +"岁");
	}
	public static void main(String[] args){
	//实例化对象p1
	Test6 p1 = new Test6();
	//调用方法
	p1.say();
	}

}