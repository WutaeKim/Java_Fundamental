package java_20190715;

public class Literal {
	public static void main(String[] args) {
		//byte ������ �Ѿ�� ������ �����߻�
		// byte a1 = (byte)128; // -128
		int a1 = 128;
		int a2 = 072;
		int a3 = 0x123;
		long a4 = 2200000000l;
		int a5 = (int)2200000000l;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		//float ���ͷ��� �Ҽ��� �ڿ� f, F�� ǥ��
		
		//double ���ͷ��� �Ҽ��� �ڿ� d, D�� ǥ��. ��������
		
		//boolean ���ͷ��� true, false
		boolean isExist = false;
		isExist =  4 == 3;
		System.out.println(isExist);
		
		//primitive�� == �����ڴ� Ÿ�Ի������ ���� ���Ѵ�
		 int i1 = 10;
		 double d1 = 10d;	 
		 System.out.println(i1 == d1);
		 
		//primitive������ ������ �ƴϱ� ������ b1�� b2�� ��ȭ�� ������ ���� �ʴ´� 
		 int b1 = 10;
		 int b2 = b1;
		 b2 = 20;
		 System.out.println(b1 == b2);
		  
		 byte k1 = 10;
		 byte k2 = 20;
		 byte k3 = (byte)(k1 + k2);
		 System.out.println(k3);
	
		
	}
}
