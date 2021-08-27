
public class Person {
	// 속성 : 이름, 성별, 나이, 혈액형
	private String name;
	private String se;
	private int age;
	private String blood;
	// (조건) 생성자 오버로딩

	Person(String name, String se, int age,String blood){
		System.out.println("생성자 오버로딩");
		this.name = name;
		this.se = se;
		this.age = age;
		this.blood=blood;
	}
	Person(){
		this("","",0,"");
	}
	// Getter/Setter
	// 현재값 = get필드명(), set필드명()
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	// 행동/기능 : 잠자기, 먹기, 놀기, 일하기
	void sleep() {
		System.out.println("sleep");
	}
	void eat() {
		System.out.println("eat");}
	void play(String play) {
		System.out.println(play + "하며 논다");}
	void work() {
		System.out.println("work");}
	
}
