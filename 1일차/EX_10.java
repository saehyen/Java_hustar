// �ݺ��� ��������
// break : �ݺ�����
// continue : �ݺ��� ����� ( �ش����� �Ʒ� ����x )

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 ���� ���� ���
		for(int num=1; num<=10; num++) {
			System.out.println(num);
		}
	
	// 1~10���� ���� ��� ��, 7�� ����� ������ ����
	for(int num=1; num<=10; num++) {
		if (num%7 == 0) break;
		System.out.println(num);
		}
	
	// 1~10���� ���� ���, �� 7�� ����� ���x
	for(int num=1; num<=10; num++) {
		if (num%7 == 0) continue;
		System.out.println(num);
		}
	}
}
