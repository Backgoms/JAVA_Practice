import java.util.Scanner;

public class practice_01 {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1. 원하는 단을 정수로 입력");
		System.out.println("2. 구구단 전체 출력");
		System.out.println("3. 나가기");
		
		int choice = scn.nextInt();
		int right = 1;
		
		if( choice == 1) {
			System.out.print("원하는 단을 입력해주세요.(2~9) >");
			int table = scn.nextInt();			
			
			if( 1 < table && table <10) {
				System.out.println(table + "단");
				while( right <= 9) {							
				int value1 = table * right;
				System.out.print(table + "X" + right + " = " + value1 +" ");
				right++;
				}
			}else {
				System.out.println("2~9 단 사이의 정수를 입력해주세요.");
			}
		}else if(choice == 2){
			for(int left = 2;left<=9;left++) {
				System.out.println("");
				System.out.println(left	+"단");
				for(right=1; right<=9;right++) {
					int value2 = left * right;
					System.out.println(left + "X" + right + " = " + value2);
				}
			}
		}else if(choice == 3){
		}	
	}
}