// class 첫글자는 대문자
// 출력 메소드와 변수
//-------------------------------------------------------
public class Test {
	//멤버변수(속성, 변수)------------------------------------
	
	
	// 멤버 메서드 - 프로그램 실행 메서드 ------------------------
	public static void main(String[] args) {
		// 화면(콘솔)에 출력 메소드
		System.out.println("Test");
	

	// 변수 선언
	byte 	age;
	int 	password;
	char 	ch;
	boolean isOk;
	float 	fnum;
	double 	dnum;
	String name=null; // String 클래스
	final int ID_num = 100;
	final int pi = 3.14;
	// 변수에 값 넣기
	age = 10;
	password = 1234567;
	ch = 'a'; // 문자 입력 시 '문자 1개'
	isOk = true; // true, false는 Java에서 약속된 문자 키워드(소문자)
	fnum = 2.456f; // float일 경우 실수숫자f
	dnum = 2.456;
	name = "Hong";
	// ID_NUM = 1234;  => 상수 변경시 오류발생
	
	
	System.out.println("age 		: " + age);
	System.out.println("password 	: " + password);
	System.out.println("ch		: " + ch);
	System.out.println("isOk 		: " + isOk);
	System.out.println("fnum 		: " + fnum);
	System.out.println("dnum		: " + dnum);
	System.out.println("name		: " + name);
	System.out.println("ID_NUM      : " + ID_num);
	
	}
}
