//------------------------------------------------------------
//RobotCar 클래스
//설명 : 자동차 관련 클래스
//클래스명 : Car
//속성 : 차번호, 제조사, 문개수, 엔진 						<<= 변수
//기능/역할 : 전진, 후진, 좌회전, 우회전, 정지				<<= 함수
//------------------------------------------------------------
public class RobotCar extends Car{
	String lang;
	RobotCar(String no ,String maker, int door, String engine,String lang){
		super(no,maker,door,engine);
		System.out.println("Car(4) 생성자(자식) 실행");
		
	}
	RobotCar(){
		this("no","maker",0,"engine","KOR");
	}
	// Getter,setter Method -----------------------------------
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMaker() {
		return maker;
	}
	@Override
	void forward() {
		// TODO Auto-generated method stub
		// super.forward();
		// 상속관계에서만 성립, 부모로부터 상속 받은 메서드 재구현
		System.out.println("로봇스럽게 앞으로 가기");
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	// -------------------------------------------------

	void walk() {
		System.out.println("걷기");}
	
	void run() {
		System.out.println("뛰기");
	

	}
}
