import java.util.Scanner;
public class EX_05_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �Է� ������ ��û
		System.out.print("���� : ");
		int score =sc.nextInt();
//		if (score >= 80) {
//			System.out.println("�հ��Դϴ�.");
//		}
//		else {
//			System.out.println("���հ��Դϴ�.");
//		}

//		String ret = (score>=80)? "�հ�" : "���հ� ";
//		System.out.println(ret + "�Դϴ�.");
		
		System.out.println("����� " + ((score >=80)? "�հ�" : "���հ�") + "�Դϴ�.");
		char grade='A';
		if (score >= 90) grade='A';
		else if (score>= 80)	grade = 'B';
		else if (score>= 70) grade = 'C';
		else if (score>= 60) grade = 'D';
		else grade='F';
	
	
	System.out.println("����� ���� : " + grade);
	}
}
