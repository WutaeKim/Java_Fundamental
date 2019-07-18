/*
 * 1. 각 자리수를 2부터 9까지 곱하고, 다시 2부터 5까지 곱해서 합을 구한다
 * 2. 총 합을 11로 나눈 나머지르 구한다
 * 3. 11에서 나머지를 뺀다
 * 4. 3의 결과를 10으로 나눈 나머지를 구한다
 * 5. 4의 결과와 마지막 숫자가 같으면 정상적인 주민 번호
 */
package java_20190716;

public class SsnDemo{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] ids = {8, 0, 0, 3, 3, 0, 1, 0, 4, 6, 5, 1, 4};
        System.out.println(calcID(ids));
        if (calcID(ids) == ids[ids.length - 1]) {
        	System.out.println("올바른 ID를 갖고 계시네요");
        } else System.out.println("당신은 간첩입니까??");
        
     }
     
     public static int calcID(int[] id) {
         
         int[] id2 = new int[13];
         int[] id3 = new int[13];
         for (int i = 0; i <= 12; i++) {
             id2[i] = id[i];
         }
         
         for (int i = 2; i <= 14; i++) {
             if (i < 10) {
                id3[i-2] = id2[i-2] * i ; 
             } else if (i == 14) {
                id3[i-2] = id2[i-2];
             } else id3[i-2] = id2[i-2] * (i - 8);
    //         System.out.println(id3[i-2]);
             
         }
         
         int sum = 0;
         int result = 0;
         
         
         for (int i = 0; i <= 11; i++) {
             sum += id3[i];
         }
         
     //    if (11 - (sum % 11) < 10) result = sum % 11; else result = 11 - (sum % 11);
         
         for (int i = 0; i <= 12; i++) {
             System.out.println(id3[i]);
         }
         
         
         return (11 - (sum % 11)) % 10;
     }
     

}
     
/*
public class SsnDemo {
 
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;

		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9
				+ b3 * 2 + b4 * 3 + b5 * 4 + b6 * 5; 		
		
		int rest = sum % 11;
		rest = 11 - rest;
		rest = rest % 10;
		if (rest == b7) {
			System.out.println("정상적인 주민번호");
		} else {
			System.out.println("비 정상적인 주민 번호");
		}

		
	}
}
*/