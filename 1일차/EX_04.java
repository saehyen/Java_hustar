// ----------------------------------------------------------------------------
// 기본 연산자
// ----------------------------------------------------------------------------
public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뱐수 선언 ------------------------------------------------------------
		int num1= 1;
		int num2 = 3;
		
		// 산술 연산 ------------------------------------------------------------
		System.out.printf("%d + %d = %d \n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d \n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d \n", num1, num2, num1/num2);
		System.out.printf("%d  %d = %d \n", num1, num2, num1%num2);
		// 조건(삼항) 연산자
		System.out.printf("%d = %d = %s \n", num1,num2,num1==num2);
		System.out.printf("%d = %d = %s \n", num1,num2,num1!=num2);
		
	}

}
