package A;

public class EX_A {
	// static 키워드 메소드 => 객체 생성 없이 사용가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("아오리사과","초록색",100);
		Apple b = new Apple("아리안","빨간색",100);
		Apple c = new Apple("시나노골드","연두색",200);
		
		b.weight = 255;
		b.color="dark red";
		a.display();
		b.display();
		System.out.printf("사과 원산지 : " + a.orgin+ "\n");
	}

}
