package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] good  = new Goods[3];
		for(int i =0; i<3;i++){
			good[i] = new Goods();
		}
		for(int i =0 ; i<good.length;i++){
			String s = scanner.nextLine();
			String[] sAry = s.split(" ");
			good[i].name = sAry[0];
			good[i].price = Integer.valueOf(sAry[1]);
			good[i].stock = Integer.valueOf(sAry[2]);
			
		}
		
		for(int i =0; i<good.length;i++){
			System.out.println(good[i].name+"(가격:"+good[i].price+"원)이 "+good[i].stock+"개 입고 되었습니다.");
			
		}
		
		

		scanner.close();
	}

}
