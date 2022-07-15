import java.util.Scanner;
public class checkVowelorConstant {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a letter :");
         ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o'  || ch == 'O' || ch == 'u' || ch == 'U')
			System.out.print("letter is vowel");

		else
			System.out.print(" letter is constant");

	}
}