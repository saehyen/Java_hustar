// ----------------------------------------------------------------------------
// while 반복문
// ----------------------------------------------------------------------------
public class EX_08_while {

	public static void main(String[] args) {
		// (1) 10번 반복
		int num = 1;
		while(num <= 10) {
			System.out.println(num++);
		}
		// (2) 1부터 숫자를 더해서 합이 111보다 큰 경우 종료하기
		int num2 = 0;
		int i = 1;
		while(num2+i <= 111) {
			num2 += i++;
			System.out.println(num2);
		}
	}	
		
}
