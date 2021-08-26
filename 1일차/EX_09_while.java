import java.util.Scanner;
public class EX_09_while {

	public static void main(String[] args) {
		// 키보드로 숫자 입력받아서 합계 구하기
		// 단, 0을 입력하면 종료
		int sum = 0; int x;
		// 입력 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 키보드로 입력받기
			System.out.print("점수 입력 : ");
			x = sc.nextInt();
			// 입력값 0 여부 확인
			if (x == 0) {
				System.out.println("종료합니다.");
				break;}
			sum += x;
			// 입력값 합계 계산
			System.out.println("합계 : "+ sum);
			
		}
		
	}

}
