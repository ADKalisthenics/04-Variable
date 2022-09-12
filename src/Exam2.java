
public class Exam2 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a = " + a);
		a = 7;
		System.out.println(a);
		
		// final : 변수값 변경금지 명령어 (한 번 정해진 값을 못 바꾸게 하고 싶을 때)
		final double pi = 3.14;
		System.out.println(pi);
		//pi = 5;  // error 발생
		System.out.println("pi = " + pi);
		System.out.printf("%.10f",  pi);
	
	}
}
