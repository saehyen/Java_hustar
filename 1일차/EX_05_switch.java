import java.util.Scanner;
public class EX_05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade = 'A';
		switch (score/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
		}
		System.out.println("당신의 학점 : " + grade);
	}
}
