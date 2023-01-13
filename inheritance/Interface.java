import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
Interface fibonacci;
{
 abstract void fibonacci(int a);
}
public class implements fibonacci {
void interface(int a){
try {
int x=-1,y=1,z=0;
BufferedWriter op = new BufferedWriter(new FileWriter("result.txt", true));
for(int i=0;i<a;i++) {
z=x+y;
op.write(String.valueOf(z));
op.write("\n");
x=y;
y=z;
}
op.close();
}
catch(Exception e) 
{
System.out.println("Error");
}
}
public static void main(String args[]) throws Exception {
File file=new File("input.txt");
Scanner scan = new Scanner(file);
int input = scan.nextInt();
Interface obj=new process();
obj.fibonacci(input);
scan.close();
}
}