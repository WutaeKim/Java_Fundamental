//특수문자중에 $, _는 사용 가능 --> 첫 글자에 사용 안하는게 관례
package java_20190715;
//클래스명의 첫 글자는 대문자
public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		//첫 글자로 숫자를 사용할 수 없음
		//String 1fatherName = "John";
		//공백을 사용할 수 없음
		//String mother Name = "Michell";
		//예약어는 식별자로 사용할 수 없음
		//String void
		String fatherName = "John";
		String motherName = "Michell";
		String 이름  = "우태";
		
		System.out.println(이름);
	}
}
