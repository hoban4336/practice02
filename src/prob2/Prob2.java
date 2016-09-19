package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int odSum =0;
		int evenSum =0;
		/* 여기에 구현 코드를 작성 합니다. */
		if(inputNumber%2 >0){
			for(int i =1 ; i <= inputNumber;i+=2){
				odSum+=i;
			}
			System.out.println(odSum);
		}else if(inputNumber%2==0){
			for(int i =2 ; i <= inputNumber;i+=2){
				odSum+=i;
			}
			System.out.println(evenSum);
		}else{System.out.println("예외가 발생했습니다.");}
		
		scanner.close();
	}
	


}
