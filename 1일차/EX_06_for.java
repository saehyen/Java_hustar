// --------------------------------------------------
// for �ݺ���
// --------------------------------------------------
import java.util.Scanner;
public class EX_06_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 1���� 100���� �������� 3�� ����� ���
		for(int i=0; i< 100; i++) {
			if ((i%3 == 0) && (i != 0)) System.out.print(i+" ");
			
		}
		System.out.printf("\n");
		// (2) �Է¹��� �� ��ŭ�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� ");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			if((i%3 == 0) && (i != 0)) {
				System.out.print(i+ " ");
			}
		}
	
	
	}

}
