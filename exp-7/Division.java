import java.util.Scanner;
public class Division {
    public static void main(String[]args) 
    {
    int a, b,result,Scanner;
   
    Scanner input = new Scanner(System.in);
    System.out.println("Input two integers");
   
    a = input.nextInt();
    b = input.nextInt();
   
    // try block
   
    try {
      result = a / b;
      System.out.println("Result = " + result);
    }
   
    // catch block
   
    catch (ArithmeticException e) {
      e.printStackTrace();
    }
    }
  }
  