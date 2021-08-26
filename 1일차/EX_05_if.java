import java.util.Scanner;
public class EX_05_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 입력 데이터 요청
		System.out.print("점수 : ");
		int score =sc.nextInt();
//		if (score >= 80) {
//			System.out.println("합격입니다.");
//		}
//		else {
//			System.out.println("불합격입니다.");
//		}

//		String ret = (score>=80)? "합격" : "불합격 ";
//		System.out.println(ret + "입니다.");
		
		System.out.println("당신은 " + ((score >=80)? "합격" : "불합격") + "입니다.");
		char grade='A';
		if (score >= 90) grade='A';
		else if (score>= 80)	grade = 'B';
		else if (score>= 70) grade = 'C';
		else if (score>= 60) grade = 'D';
		else grade='F';
	
	
	System.out.println("당신의 학점 : " + grade);
	}
}
