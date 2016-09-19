package prob4;

import java.util.Scanner;



public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner( System.in );
		System.out.println("금액을 입력하세요: ");
		String s = scanner.next();
		
		System.out.println("총금액 : " + s);
		char[] cary = s.toCharArray();
		int i = cary.length;
		switch(i){
		case 5 : 
			if(cary[0]>5){System.out.println("50000원권 : 1개");
			}
			System.out.println("10000원권: "+((cary[0]-'0')%5)+"개");
		case 4 :
			if(cary[1]>5){System.out.println("5000원권 : 1개 ");
			}
			System.out.println("1000원권: "+((cary[1]-'0')%5)+"개");
		case 3 :
			if(cary[2]>5){System.out.println("500원권 : 1개 ");
			}System.out.println("100원권: "+((cary[2]-'0')%5)+"개");
		case 2 :
			if(cary[3]>5){System.out.println("50원권 : 1개 ");
			}System.out.println("10원권: "+((cary[3]-'0')%5)+"개");
		case 1 :
			if(cary[4]>5){System.out.println("5원권 : 1개 ");
			}System.out.println("1원권: "+((cary[4]-'0')%5)+"개");
			break;
		}
		scanner.close();
	}
}

