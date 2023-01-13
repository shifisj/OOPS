abstract class Fibonacci
{
    public abstract void fib();
}
public class fibonacciAbstractclass extends Fibonacci {
    public void fib(){
    int flag=7;
    int a=0,b=1,c=0;
    if(flag==1)
            System.out.println(+a);
    else if(flag==2) 
    {
        System.out.println(+a);
        System.out.println(+b);
    }
    else
    {
        System.out.println(+a);
        System.out.println(+b);
        for(int i=1;i<flag;i++)
        {
        c=a+b;
        System.out.println(+c);
        a=b;
        b=c;
        }
    }
};
    public static void main(String arg[])
    {
        Fibonacci obj =new fibonacciAbstractclass();
        obj.fib();
    }
}