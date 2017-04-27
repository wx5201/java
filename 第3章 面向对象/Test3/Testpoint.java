class Point{
	double x,y,z;//定义成员变量x，y，z

	//	构造方法生成具有特殊坐标的点对象

	Point(double _x,double _y,double _z){
		x = _x;//给x赋值
		y = _y;
		z = _z;
}
	//提供可以设置三个坐标的方法
	void setX(double _x){
	x = _x;
}

	void setY(double _y){
	y = _y;
}

	void setZ(double _z){
	z = _z;
}
	//计算该点距原点距离的平方的方法
	double getDistance(Point p){
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
}
}
public class Testpoint{
	public static void main(String[] args){
			Point p = new Point(1.0,2.0,3.0);
			Point p1 = new Point(7.0,8.0,9.0);
			System.out.println("该点距原点距离的平方是：" + p.getDistance(p1));

		p.setX(5.0);
		System.out.println("该点距原点距离的平方是：" + p.getDistance(new Point(1.0,1.0,1.0)));
}
}