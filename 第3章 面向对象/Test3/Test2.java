class Person{
	int age;//定义成员变量age
	int id;//定义成员变量id
//定义有参的构造方法
	public Person(int int_id,int int_age){
      age=int_age;
      id=int_id;		
}
	public void speak(){
		System.out.println("我今年"+age+"岁了！");
}
}
public class Test2{
	public static void main(String[] args){
		Person tom = new Person(1,25);
		Person jack = new Person(2,23);
		tom.speak();
		jack.speak();

}
}