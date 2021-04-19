import java.util.Scanner;
class DivisionbyZero extends Exception{
    String str1;
    DivisionbyZero (String str2)
     {
    str1=str2;
      }
      public String toString()
     { 
    return (str1) ;
     }
    }
    public class MyException2
    {
     public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     System.out.print("Enter Amount:");
     int a=s.nextInt();
     int b=s.nextInt();
     int result=a/b;
      try 
     {
        if(b==0)
              {
                 throw new DivisionbyZero("Exception caught: Division by zero ");
            } 
         result=a/b;
       System.out.println("Result = " +result);
    
      }  
       // catch block
    catch(DivisionbyZero e)
      {
        System.out.println(e);
       }
    }
    }

    