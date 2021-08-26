// 배열 객체 생성
public class EX_11_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열 생성 및 초기화 방법
		int nums1[] = {1,2,3,4,5};
		
		// 2. 배열 생성 및 초기화 방법
		int nums2[] = new int[5];
		
		// 3. 배열 안에 값 읽어오기.
		// 배열 변수명[인덱스]
		System.out.println("nums1[0] = " + nums1[0]);
		System.out.println("nums1[2] = " + nums1[2]);
		
		System.out.println("nums2[0] = " + nums2[0]);
		System.out.println("nums2[2] = " + nums2[2]);
		
		// 4. 배열 안에 값 넣기
		// 배열 변수명[인데그] = 값
		nums2[0] = 10;
		nums2[2] = 3;
		
		// 5. 전체 배열 데이터 출력하기
		for(int i =0; i< nums2.length; i++) {
			System.out.printf("nums2[%d] = %d\n",i,nums2[i]);
			
		}
	}
		
}
