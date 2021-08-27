
public class Point3D extends Point2D {
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("생성자(자식)실행");
	}
	
	void area(int x, int y, int z) {
		// TODO Auto-generated method stub
		System.out.println(x*y*z);
	}
	@Override
	void area() {
		System.out.println(" x, y, z :" + x + y + z);
	}

}
