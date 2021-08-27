import A.Apple;
// ------------------------------------------------------------
// 다양한 클래스 객체를 생성해서 테스트 하는 클래스
// ------------------------------------------------------------
public class Ex_Class {

	public static void main(String[] args) {
		// Car 객체 생성 및 사용 ----------------------------------
		// (1) 객체 생성
//		Car mycar = new Car();
		// (2) 객체 안의 멤버필드, 멤버메서드 사용
//		System.out.println("My Car no : " + mycar.no);
//		System.out.println("My Car maker : " + mycar.maker);
//		System.out.println("My Car engine : " + mycar.engine);
//		System.out.println("My Car door : " + mycar.door);
//		
		// (3) 값 넣기
//		mycar.no = 	"123가 8989";
//		mycar.door= 4;
//		mycar.engine = "수소";
//		mycar.maker = "Benz";
//	
//		System.out.println("My Car no : " + mycar.no);
//		System.out.println("My Car maker : " + mycar.maker);
//		System.out.println("My Car engine : " + mycar.engine);
//		System.out.println("My Car door : " + mycar.door);
		
		Car yourCar = new Car("45나1111","가솔린",2,"벤츠");
		System.out.println("Your Car no : " + yourCar.no);
		System.out.println("Your Car maker : " + yourCar.maker);
		System.out.println("Your Car engine : " + yourCar.engine);
		System.out.println("Your Car door : " + yourCar.door);
		
		Apple redApple = new Apple();
		redApple.display();
	}

}
