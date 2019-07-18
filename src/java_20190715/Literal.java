package java_20190715;

public class Literal {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 컴파일 에러발생
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
		//float 리터럴은 소수점 뒤에 f, F로 표기
		
		//double 리터럴은 소수점 뒤에 d, D로 표기. 생략가능
		
		//boolean 리터럴은 true, false
		boolean isExist = false;
		isExist =  4 == 3;
		System.out.println(isExist);
		
		//primitive의 == 연산자는 타입상관없이 값만 비교한다
		 int i1 = 10;
		 double d1 = 10d;	 
		 System.out.println(i1 == d1);
		 
		//primitive에서는 참조가 아니기 때문에 b1은 b2의 변화에 영향을 받지 않는다 
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
