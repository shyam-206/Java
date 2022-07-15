import java.util.Scanner;

public class Findxy {
	public static void main(String[] args) {
      
    double x,y,a,b,c,d,e,f;
    Scanner sc = new Scanner("System.in");   
    System.out.println("3.4x+50.2y = 44.5");    
    System.out.println("2.1x+0.55y =5.9");
    
    a=3.4; b=50.2; e=44.5;
    c=2.1; d=0.55; f=5.9;
    
    x = ( (e*d) - (b*f) ) / ( (a*d) - (b*c) );
    y = ( (a*f) - (e*c) ) / ( (a*d) - (b*c) );
    
    System.out.println("x is "+x+" & y is "+y);
 }
}