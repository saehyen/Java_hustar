import java.util.Scanner;
public class EX_09_while {

	public static void main(String[] args) {
		// Ű����� ���� �Է¹޾Ƽ� �հ� ���ϱ�
		// ��, 0�� �Է��ϸ� ����
		int sum = 0; int x;
		// �Է� Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			// Ű����� �Է¹ޱ�
			System.out.print("���� �Է� : ");
			x = sc.nextInt();
			// �Է°� 0 ���� Ȯ��
			if (x == 0) {
				System.out.println("�����մϴ�.");
				break;}
			sum += x;
			// �Է°� �հ� ���
			System.out.println("�հ� : "+ sum);
			
		}
		
	}

}
