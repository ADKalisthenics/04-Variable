
public class Exam2 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a = " + a);
		a = 7;
		System.out.println(a);
		
		// final : ������ ������� ��ɾ� (�� �� ������ ���� �� �ٲٰ� �ϰ� ���� ��)
		final double pi = 3.14;
		System.out.println(pi);
		//pi = 5;  // error �߻�
		System.out.println("pi = " + pi);
		System.out.printf("%.10f",  pi);
	
	}
}
