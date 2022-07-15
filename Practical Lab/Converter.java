import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value in Meters :");

		double meter = sc.nextDouble();
		double feet = meter * 3.28024;

		System.out.print(meter+ " Meters =" +  feet +" Feets");
	}
}