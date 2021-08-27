
public class Point4D extends Point3D
{
	int time;
	Point4D(int x, int y, int z,int time) {
		super(x,y,z);
		this.time = time;
		System.out.println("생성자(자식2)실행");
	}
	
	void area(int x, int y, int z, int time) {
		// TODO Auto-generated method stub
		System.out.println(x*y*z*time);
	}
	
	@Override
	void area() {
		System.out.println(" x, y, z,time :" + x + y + z + time);
	}

}
