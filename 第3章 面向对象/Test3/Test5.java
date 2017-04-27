public class Test5{
	public int x = 360;//定义常量x
	public int y = 720;//定义常量y

	//定义方法求和sum
	public void sum(){
		int z = this.x + this.y;
		System.out.println("x+y = " + z);

	}


	public static void main(String[] args){
		//创建对象
		Test5 p1 = new Test5();
        //调用方法sum
		p1.sum();

	}

}