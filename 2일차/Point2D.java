
public class Point2D {
	// 속성,필드 : x,y
	// 행동/기능 : 넓이 구하기(), 정보출력()
	int x;
	int y;
	
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("생성자(부모) 실행");
	}
	Point2D(){
		this(0,0);
	}
	void area() {
		System.out.print("넓이 : " + x*y);
	}
}
