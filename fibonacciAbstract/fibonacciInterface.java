interface Fibonacci
{
    void fibbo();
}
class fibonacciInterface implements Fibonacci
{
    public void fibbo(){
        int a=0,b=1,c=0,flag=7;
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
    }
    public static void main(String arg[]){
        Fibonacci obj=new fibonacciInterface();
        obj.fibbo();
    }
}
