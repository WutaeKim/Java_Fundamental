package java_20190716;

public class IfDemo {
	public static void main(String[] args) {
		/*Run Configurations => Arguments => Program Arguments(다수 인자는 스페이스로 구분)
		System.out.println(month);*/
		
		int month = Integer.parseInt(args[0]);
		
		String season = null;
/*		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5){
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8){
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11){
			season = "가을";
		} else {
			season = "없는 계절";
		}
*/
		
		if(month == 12 || 1 <= month && month <= 2) {
			season = "Winter";
		} else if (month >= 3 && month <= 4){
			season = "Spring";
		} else if (6 <= month && month <= 7){
			season = "Summer";
		} else if (month >= 9 || month <= 10){
			season = "Autumn";
		} else {
			season = "What!!";
		}
		System.out.println(month + "월은 " + season + "입니다." );
		
	}
}

