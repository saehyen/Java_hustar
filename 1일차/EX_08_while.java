// ----------------------------------------------------------------------------
// while �ݺ���
// ----------------------------------------------------------------------------
public class EX_08_while {

	public static void main(String[] args) {
		// (1) 10�� �ݺ�
		int num = 1;
		while(num <= 10) {
			System.out.println(num++);
		}
		// (2) 1���� ���ڸ� ���ؼ� ���� 111���� ū ��� �����ϱ�
		int num2 = 0;
		int i = 1;
		while(num2+i <= 111) {
			num2 += i++;
			System.out.println(num2);
		}
	}	
		
}
