package java_20190715;

public class characterLiteral {
	public static void main(String[] args) {
		char kim = '\uae40';
		char woo = '\uc6b0';
		char tae = '\ud0dc';
		System.out.println(kim);
		System.out.println(woo + tae);
		System.out.println(tae);
		System.out.println((int)woo);
		System.out.println((int)tae);
	}
}
