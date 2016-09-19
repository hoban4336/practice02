package prob6;

public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		
		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c);   // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}

	static void replaceSpace( char a[] ) {
		int count =0;
		for(char tmp : a){
			if(tmp==32){
				a[count] =',';
			}
			count++;
		}
	}

	static void printCharArray( char a[] ) {
		for(char tmp:a){
			System.out.print(tmp);
		}
		System.out.println("");
	}
}
