package study4;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		
		for(int n = 1; n<=100; n++) {
			
		if (n % 3 == 0 && n % 5 == 0)
			x += n;
		if (n % 3 == 0 && n % 5 == 0)
			y += 1;
		
		}
		
		System.out.println("3의 배수이면서 5의 배수인 수의 합은 : " + x + "입니다.");
		System.out.println("3의 배수이면서 5의 배수인 수의 갯수는 : " + y + "입니다.");
	
		
		/*1~100사이에
		 * 3의 배수 이면서 5의 배수 합 구하고 갯수 구하기
		 */
	}

}
