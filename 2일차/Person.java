
public class Person {
	// �Ӽ� : �̸�, ����, ����, ������
	private String name;
	private String se;
	private int age;
	private String blood;
	// (����) ������ �����ε�

	Person(String name, String se, int age,String blood){
		System.out.println("������ �����ε�");
		this.name = name;
		this.se = se;
		this.age = age;
		this.blood=blood;
	}
	Person(){
		this("","",0,"");
	}
	// Getter/Setter
	// ���簪 = get�ʵ��(), set�ʵ��()
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	// �ൿ/��� : ���ڱ�, �Ա�, ���, ���ϱ�
	void sleep() {
		System.out.println("sleep");
	}
	void eat() {
		System.out.println("eat");}
	void play(String play) {
		System.out.println(play + "�ϸ� ���");}
	void work() {
		System.out.println("work");}
	
}
