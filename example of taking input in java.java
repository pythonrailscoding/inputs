/* Here, file name is input.java */
import java.util.Scanner;
/* Scanner helps us to take input */
public class input
{

  public static double sum(double a, double b){
    return a + b;
  }

  public static void main(String[] args)
  {
    /* Define variable for Scanner */
    Scanner scan = new Scanner(System.in);
    int a, b;
    System.out.println("Enter a number:");
    double num1 = scan.nextDouble();
    System.out.println("Enter another number:");
    double num2 = scan.nextDouble();
    double c = sum(num1, num2);
    System.out.println("The sum of " +  num1 + " and " + num2 + " is " + c);
    /* Close our Scanner to prevent memory leak */
    scan.close();
   }
}
