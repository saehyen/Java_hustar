// 반복문 동작제어
// break : 반복종료
// continue : 반복을 재실행 ( 해당조건 아래 실행x )

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 까지 숫자 출력
		for(int num=1; num<=10; num++) {
			System.out.println(num);
		}
	
	// 1~10까지 숫자 출력 단, 7의 배수가 나오면 종료
	for(int num=1; num<=10; num++) {
		if (num%7 == 0) break;
		System.out.println(num);
		}
	
	// 1~10가지 숫자 출력, 단 7의 배수는 출력x
	for(int num=1; num<=10; num++) {
		if (num%7 == 0) continue;
		System.out.println(num);
		}
	}
}
