package prob4;

import java.util.Scanner;

import sun.security.util.Length;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("금액을 입력하세요: ");
		String s = scanner.next();
		
		System.out.println("총금액 : " + s);
		char[] cary = s.toCharArray();
		int length = cary.length;
				
		for(int i=0;i<length;i++){
			if(cary[i]>5){System.out.println(5*(int)Math.pow(10,(length-i))+"원권: 1개 ");}
			System.out.println((int)Math.pow(10,(length-i))+"원권: "+((cary[i]-'0')%5)+"개");
		}
		

	}
}
