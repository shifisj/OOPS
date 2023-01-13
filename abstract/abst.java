import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
interface fibb{
public abstract void fib(int n);
}
public class abst implements fibb
{
public void fib(int n){
try {
int x=-1,y=1,z=0;
BufferedWriter op = new BufferedWriter(new FileWriter("result.txt", true));
for(int i=0;i<n;i++) {
z=x+y;
op.write(String.valueOf(z));

op.write("\n");
x=y;
y=z;
}
op.close();
}
catch(Exception e) {
System.out.println("Error");
}

}
public static void main(String args[]) throws Exception {
File file=new File("input.txt");
Scanner scan = new Scanner(file);
int input = scan.nextInt();
process obj=new process();
obj.fibb(input);
scan.close();
}
}