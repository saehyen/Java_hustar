package A;

// ----------------------------------------------------
// 사과에 관련된 클래스
// 클래스명 : Apple
// 속성,필드 : kind, color, weight
// 기능,행동 : displayInfo()
//----------------------------------------------------
public class Apple {
	// Member field -----------------------------------
	// 인스턴스 멤버 필드 ( 생성되는 객체마다 존재하는 필드 )
	private String kind;
	protected String color;
	int weight;
	
	// 클래스 멤버 필드 ( 1개만 존재 ) ( 공유 변수 )
	static String orgin = "국산" ;
	
	// 상수 멤버 필드
	final String code = "NO";
	
	public Apple(String kind, String color, int weight){
		this.kind = kind;
		this.color = color;
		this.weight= weight;
	}
	
	public Apple(){
		this("unknown","unkown",0);
	}
	// getter,setter
	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void display() {
		// 사과에 대한 정보 출력 메소드
		System.out.printf("사과 품종 : " + this.kind + "\n");
		System.out.printf("사과 색 : " + this.color + "\n");
		System.out.printf("사과 무게 : " + this.weight+ "\n");
		// System.out.printf("사과 원산지 : " + this.orgin+ "\n");
	}
}
