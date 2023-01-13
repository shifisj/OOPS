import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

 abstract class Fib
{
    abstract void fibonacci(int a);
}
public class Fibonacci extends Fib
{
 void fibonacci(int a)
    {
        try{
            int x=0;
            int y=0;
            int z=1;
            BufferedWriter op=new BufferedWriter(new FileWriter("result.txt",true));
            op.write("0");
            op.write("\n");
            op.write("1");
            for(int i=2;i<a;i++){
                x=y;
                y=z;
                z=x+y;
                op.write("\n");
                op.write(String.valueOf(z));}
            op.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    public static void main(String args[])throws Exception
    {
        File get=new File("input.txt");
        Scanner in=new Scanner(get);
        int input=in.nextInt();
        Fibonacci obj=new Fibonacci();
        obj.fibonacci(input);
    }
}