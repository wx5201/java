class Person{
	int age;//�����Ա����age
	int id;//�����Ա����id
//�����вεĹ��췽��
	public Person(int int_id,int int_age){
      age=int_age;
      id=int_id;		
}
	public void speak(){
		System.out.println("�ҽ���"+age+"���ˣ�");
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