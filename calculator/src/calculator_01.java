import java.util.Scanner; 

public class calculator_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
							
		System.out.print("숫자를 입력해주세요(1) >");
			int firstNumber = scn.nextInt(); //int타입의 firstNumber를 선언 후 입력받은 값을 저장
				
		System.out.print("연산할 부호를 입력해주세요 >");
		String sign = scn.next(); // String 타입의 Sign을 선언 후 입력받은 값을 저장
		
		System.out.print("숫자를 입력해주세요(2) >");
			int secondNumber = scn.nextInt(); // int secondNumber를 선언 후 입력 받은 값을 저장
						
			
		int result = 0; //result 값을 선언 후 초기화
			
		if(sign.equals("+")){ //입력된 연산 부호가  "+" 와 같다면 아래 실행문을 실행
			result = firstNumber + secondNumber ; // 첫번째 입력된 숫자와 두번째 입력된 숫자의 합을 result에 저장
			System.out.println(result); //계산되어 저장된 result 값을 출력
			
		}else if(sign.equals("-")) {
			result = firstNumber - secondNumber;
			System.out.println(result);
			
		}else if(sign.equals("*")) {
			result = firstNumber * secondNumber;
			System.out.println(result);
			
		}else if(sign.equals("/")) {
			result = firstNumber / secondNumber;
			System.out.println(result);
			
		}else { //사친연산 부호 입력에서 위에 있는 부호가 입력되지 않은 경우 아래 실행문을 실행
			System.out.println("잘 못 입력하셨습니다.");
		}
	}
}

