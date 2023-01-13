class Fibonacci {
    int n = 10;
}
class fib extends Fibonacci{
    void fibo(){
        int a=0,b=1,c=0;
    
        if(n==1)
           System.out.println(+a);
        else if(n==2)
        {
            System.out.println(+a);
            System.out.println(+b);
        }
        else{
            System.out.println(+a);
            System.out.println(+b);
            for(int i=1;i<=n;i++) {
                c=a+b;
                System.out.println(+c);
                a=b;
                b=c;
            }
        }
    }
}
class fibonacciInheritance
{
    public static void main(String args[])
    {
        fib d = new fib();
        d.fibo();
    }
}