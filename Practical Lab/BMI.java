import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your weight in pound = ");
    double pound = sc.nextDouble();
    System.out.print("Enter your Height in Inch = ");
    double inch = sc.nextDouble();
    
    double BMI = (pound*0.4535927) / ((inch * 0.0254) * (inch  * 0.0254 ));
    
    System.out.print("BMI ="+BMI);
    
	}
}