import java.util.Scanner;

/*
 * if�� ����
 *1) ������ �Է¹��� ���� ¦���̸� ¦��, Ȧ���̸� Ȧ�� ����ϱ�
 *
 *2) ������ �Է¹޾Ƽ�
 *3�� ����̸� 3�� ����Դϴ� ���
 *5�� ����̸� 5�� ����Դϴ� ���
 *3,5�� ����� �ƴϸ� ������� ����
 */
public class Ex03 {

	public static void main(String[] args) {

		// 1. �������� �Է¹޴´�.
		System.out.println("������ �Է����ּ��� ");

		// 2. Ű���� �Է¹ޱ�
		// Ű���� �Է¹ޱ� ���ؼ� scanner ����
		Scanner scanner = new Scanner(System.in);
		// Ű���� ���� �Է¹ޱ�
		int input = scanner.nextInt();

		/*
		 * ¦��(x%2 => 0) -> ¦�� ��� Ȧ��(x%2 => 0�� �ƴϴ�) -> Ȧ�� ���
		 */
		if (0 == input % 2) {
			System.out.print("¦��");
		} else if (0 != input % 2) {
			System.out.println("Ȧ��");
		} else /* if(0==input) */ {
			System.out.println("0");
		}
		/*
		 * 3�� ����̸� 3�� ����Դϴ� ��� (input%3 == 0) 5�� ����̸� 5�� ����Դϴ� ��� (input %5 ==0) 3,5��
		 * ����� �ƴϸ� ������� ����
		 */

		if (0 == input % 3) {
			System.out.print("3�� ���");
		} else if (input % 5 == 0) {
			System.out.println("5�� ���");
		}
	}

}
