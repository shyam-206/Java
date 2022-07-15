import java.util.Scanner;
public class Reverse{
  public static void main(String args[]){
   int arr[] = new int[10];
   Scanner input = new Scanner(System.in);
   
   for(int i=0;i<10;i++)
   {  
      System.out.print("Enter a Number "+ (i+1) + " :");
      arr[i] = input.nextInt();
   }
   reverse(arr);
   System.out.println("After Reversing a Number");
   for(int i=0;i<10;i++)
   {
      System.out.print("value of number position "+ (i+1) +" "+ arr[i] +"\n");
   }
 }
  
  public static void reverse(int arr[]){
   int temp;
   for(int i=0;i<arr.length/2;i++)
   {
      temp=arr[i];
      arr[i]=arr[arr.length-i-1];
      arr[arr.length-i-1]=temp;
   }  
  }
}