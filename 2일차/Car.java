// ------------------------------------------------------------
// Car 클래스 ( 사용자 정의 클래스 )
// 설명 : 자동차 관련 클래스
// 클래스명 : Car
// 속성 : 차번호, 제조사, 문개수, 엔진 						<<= 변수
// 기능/역할 : 전진, 후진, 좌회전, 우회전, 정지				<<= 함수
// ------------------------------------------------------------
public class Car {
	// 멤버 변수-------------------------------------------------
	String no;
	String maker;
	int	   door;
	String engine;
	// Constructor Method -------------------------------------
	// new 키워드로 객체 생성 시, 멤버필드 값 설정
	// 반환값 없음
	// 메소드 이름은 클래스명과 동일
	
	Car(String no ,String maker, int door, String engine){
		System.out.println("Car(4) 생성자(부모) 실행");
		this.no = no;
		this.maker=maker;
		this.door=door;
		this.engine=engine;
	}
	Car(){
		this("미정","미정",0,"미정");
//		this.no 	= 	"미정";
//		this.maker  =	"미정";
//		this.door   =	0;
//		this.engine =	"미정";
		System.out.println("Car() 디폴트 생성자 실행");
	}
	
	// 멤버 메소드------------------------------------------------
	void forward() {
		System.out.println("전진");
	}
	void backward() {
		System.out.println("후진");
	}
	
	void goLeft() {
		System.out.println("좌회전");
	}
	void goRight() {
		System.out.println("우회전");
	}
	void stop() {
		System.out.println("정지");
	}	
}
