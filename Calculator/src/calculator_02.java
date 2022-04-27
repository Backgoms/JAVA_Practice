import java.util.Scanner;


public class calculator_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String yn; // 종료 문자열을 저장할 변수 선언
		int result; // 결과 갑슬 저장 할 변수 선언
		
	
		Loop1 :while(true) {	//계산이 끝난 후에도 또 계산을 할 수 있도록 무한으로 만듦	
			System.out.print("숫자를 입력해주세요(1) >");
			int firstNumber = scn.nextInt(); //int타입 firstNumber 변수 선언, 계산할 첫번째 숫자를 입력 받아 firstNumber에 저장
				
			System.out.print("연산할 부호를 입력해주세요 >");
			String sign = scn.next(); //String타입 sign 변수를 선언, 계산할 연산자를 입력 받아 sign에 저장
			
			System.out.print("숫자를 입력해주세요(2) >");
			int secondNumber = scn.nextInt(); //int타입 secondNumber 변수 선언, 계산할 첫번째 숫자를 입력 받아 secondNumber에 저장
			
			if(sign.equals("+")){ //입력받은 문자열이 "+"와 일치하는지 확인 후 일치한다면 아래 실행문을 실행
				result = firstNumber + secondNumber ; // 입력받은 수를 더하여 result에 저장
				System.out.println(result);
				
				System.out.print("종료(y/n)"); 
				yn = scn.next();	//계산 종료 후 프로그램을 종료 여부를 입력받아 yn에 저장		
				if(yn.equals("y") || yn.equals("Y")) { // 입력받은 문자열이 "y"와 일치하면 아래 실행문을 실행
					break Loop1; // Loop1(while문)을 빠져나감
				}
			}else if(sign.equals("-")) { 
				result = firstNumber - secondNumber;
				System.out.println(result);
				
				System.out.print("종료(y/n)");		
				yn = scn.next();			
				if(yn.equals("y")) {
					break Loop1;
				}
			}else if(sign.equals("*")) {
				result = firstNumber * secondNumber;
				System.out.println(result);
			
				System.out.print("종료(y/n)");		
				yn = scn.next();			
				if(yn.equals("y")) {
					break Loop1;
				}
			}else if(sign.equals("/")) {
				result = firstNumber / secondNumber;
				System.out.println(result);
			
				System.out.print("종료(y/n)");		
				yn = scn.next();			
				if(yn.equals("y")) {
					break Loop1;
				}else // 마지막에 입력 받은 값이 사칙연산이 아닐 경우 아래에 실행문을 실행하고 while문으로 돌아감
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
	}
}
