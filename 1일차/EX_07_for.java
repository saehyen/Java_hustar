
public class EX_07_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2~9단까지 구구단 출력
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.printf("\n");
		}
	}

}
