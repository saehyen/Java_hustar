
public class EX_02 {

	public static void main(String[] args) {

		int num = 12345678;
		byte age = 10;
		float fnum;
		// 적은 공간에 큰 데이터 넣기 : 강제 형변환
		age = (byte)num;
		System.out.println("age : " + age);
		
		
		// 큰 공간에 작은 데이터 넣기 : 자동 형변환
		fnum = num;
		System.out.println("fnum : " + fnum);
	}

}
