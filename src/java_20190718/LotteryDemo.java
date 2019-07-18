package java_20190718;

public class LotteryDemo {
	public static void main(String[] arg) {
		//Math.random() => 0보다 크거나 같고 1보다 작은 양수를
		//double 값으로 반환한다
//		double random = Math.random();

//		int temp = (int)(random * 45) + 1;
//		System.out.println(random);
//		System.out.println(temp);
		
		int[] lotto = new int[6];
	
		for (int i = 0; i < lotto.length; i++) {
//			double random = Math.random();
			int temp = (int)(Math.random() * 45) + 1;
			lotto[i] = temp;
			if (i > 0) {
				for (int j = 0; j < i ; j++) {					
					for ( ;lotto[i] == lotto[j]; 
							) {
						lotto[i] = (int)(Math.random() * 45) + 1;
					}
					
				}
			}		
		}
		

/*		
		for (int i = 0; i < lotto.length; i++) {
			// temp는 1보다 크거나 같고 45보다 작거나 같은 임의의 값
			// 매번 새로 생성되어야 한다
			int temp = (int)(Math.random() * 45) + 1;
			if (i == 0) { // 첫 번째 방은 무조건 임의의 값 temp를 저장한다
				lotto[i] = temp;
			} else {
				// isExist는 임의의 값 temp와 이전 배열의 값을 비교 했을 때
				// 동일한 값이 있는 경우는 true, 없으면 false
				boolean isExist = false;
				// i == 1 아래의 for loop는 1번 반복
				// i == 2 아래의 for loop는 2번 반복...
				for(int j = 0; j < i; j++) {
					if(lotto[j] == temp) {
						isExist = true;
						break;
					}
				}
				if(!isExist) {
					lotto[i] = temp;
				} else {
					i--;
				}
			}
		}
*/		
		for (int j = 0; j < lotto.length - 1; j++ ) {
			for (int i = 0; i < lotto.length - (1 + j); i++) {
				int temp = lotto[i];
				if (lotto[i] > lotto[i + 1]) {
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;				
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
	}
}





