public class Test4{
	public String name;//定义成员变量name
	public int age;//定义成员变量age
	
	//定义构造方法Test4
	public Test4(String name,int age){
		this.name = name;
		this.age = age;
}
	//定义方法say
	public void say(){
		System.out.println("大家好，我叫"+ name +"，我今年"+ age +"岁！");
	}
	
	public static void main(String [] args){
		//创建对象obj
		Test4 obj = new Test4("黎明",23);
		obj.say();

	}

}