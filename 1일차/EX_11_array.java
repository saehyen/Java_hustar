// �迭 ��ü ����
public class EX_11_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �迭 ���� �� �ʱ�ȭ ���
		int nums1[] = {1,2,3,4,5};
		
		// 2. �迭 ���� �� �ʱ�ȭ ���
		int nums2[] = new int[5];
		
		// 3. �迭 �ȿ� �� �о����.
		// �迭 ������[�ε���]
		System.out.println("nums1[0] = " + nums1[0]);
		System.out.println("nums1[2] = " + nums1[2]);
		
		System.out.println("nums2[0] = " + nums2[0]);
		System.out.println("nums2[2] = " + nums2[2]);
		
		// 4. �迭 �ȿ� �� �ֱ�
		// �迭 ������[�ε���] = ��
		nums2[0] = 10;
		nums2[2] = 3;
		
		// 5. ��ü �迭 ������ ����ϱ�
		for(int i =0; i< nums2.length; i++) {
			System.out.printf("nums2[%d] = %d\n",i,nums2[i]);
			
		}
	}
		
}
