package java_20190716;
//ctrl + shift + f => �ڵ����� �� ���߱�
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 23;
		int c = 0;
		double d;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);

		c = b / a;
		System.out.println(c);

		d = (double)b / (double)a;
		System.out.println(d);

		d = (double)(b / a);
		System.out.println(d);

		c = b % a;
		System.out.println(c);
		
		a += b; //a = a + b
		System.out.println(a);
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		a++;
		b++;
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(a);
		System.out.println(b);
		
		++a;
		++b;
		System.out.println(++a);
		System.out.println(++b);
		
		//���� �� ����
		c = a++;
		System.out.println(c);
		//���� �� ����
		c = ++a;
		System.out.println(c);
		
		a = 10;
		b = 20;
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		isSuccess = a < b;
		System.out.println(isSuccess);
		isSuccess = a >= b;
		System.out.println(isSuccess);
		isSuccess = a <= b;
		System.out.println(isSuccess);
		isSuccess = a == b;
		System.out.println(isSuccess);
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		a = 10;
		b = 10;
		//short circuit �߻�
		//a && b => a�� false�̸� b������ ���� ����
		//a || b => a�� true�̸� b������ ���� ����
		isSuccess = (a != b) && (++a == b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(isSuccess);

		isSuccess = (a != b) || (++a == b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(isSuccess);
		System.out.println(!isSuccess);
		
		//��Ʈ���� : 1�� true, 0�� false
		//00000111 & 00000101
		//00000111 | 00000101
		System.out.println(7 & 5);
		System.out.println(7 | 5);
		
		
	}
}
