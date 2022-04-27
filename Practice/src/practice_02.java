
public class practice_02 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		while(sum <= 1000) { 
			if(number%3==0 && number%2==0) {
				sum = sum +number;				
				System.out.println(sum);
			}else 
				number++;
		}
	}
}