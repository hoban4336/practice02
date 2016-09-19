package prob3;
import java.util.Scanner;


public class Prob3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		s = s.toUpperCase();
		System.out.println(s);
		char[] cAry = s.toCharArray();
		/*  나머지 코드를 구현합니다. */
		for(int i =1 ; i<cAry.length ; i++){
			for( int j =0 ;j<= i ; j++){
				System.out.print(cAry[j]);
			}
			System.out.println("");
		}
		
		scanner.close();
	}
}
