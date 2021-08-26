// --------------------------------------------------
// for 반복문
// --------------------------------------------------
import java.util.Scanner;
public class EX_06_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 1에서 100사이 범위에서 3의 배수만 출력
		for(int i=0; i< 100; i++) {
			if ((i%3 == 0) && (i != 0)) System.out.print(i+" ");
			
		}
		System.out.printf("\n");
		// (2) 입력받은 수 만큼만 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 ");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			if((i%3 == 0) && (i != 0)) {
				System.out.print(i+ " ");
			}
		}
	
	
	}

}
