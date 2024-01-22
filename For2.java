package study4;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		
		for(int n = 1; n<=100; n++) {
			
		if (n % 2 == 0)
			x += n;
		else
			y += n;
		
		}
		
		System.out.println("홀수의 합은 : " + y + "입니다.");
		System.out.println("짝수의 합은 : " + x + "입니다.");
	
		
		/*1~100사이에
	
		 * 홀수합과 짝수합을 구하시오
		 */
	}

}
