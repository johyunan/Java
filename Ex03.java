import java.util.Scanner;

/*
 * if문 예제
 *1) 정수를 입력받은 수가 짝수이면 짝수, 홀수이면 홀수 출력하기
 *
 *2) 정수를 입력받아서
 *3의 배수이면 3의 배수입니다 출력
 *5의 배수이면 5의 배수입니다 출력
 *3,5의 배수가 아니면 출력하지 않음
 */
public class Ex03 {

	public static void main(String[] args) {

		// 1. 정수값을 입력받는다.
		System.out.println("정수를 입력해주세요 ");

		// 2. 키보드 입력받기
		// 키보드 입력받기 위해서 scanner 선언
		Scanner scanner = new Scanner(System.in);
		// 키보드 정수 입력받기
		int input = scanner.nextInt();

		/*
		 * 짝수(x%2 => 0) -> 짝수 출력 홀수(x%2 => 0이 아니다) -> 홀수 출력
		 */
		if (0 == input % 2) {
			System.out.print("짝수");
		} else if (0 != input % 2) {
			System.out.println("홀수");
		} else /* if(0==input) */ {
			System.out.println("0");
		}
		/*
		 * 3의 배수이면 3의 배수입니다 출력 (input%3 == 0) 5의 배수이면 5의 배수입니다 출력 (input %5 ==0) 3,5의
		 * 배수가 아니면 출력하지 않음
		 */

		if (0 == input % 3) {
			System.out.print("3의 배수");
		} else if (input % 5 == 0) {
			System.out.println("5의 배수");
		}
	}

}
