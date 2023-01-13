import java.io.*;
import java.util.Scanner;
class process{
public void fibb(int n) throws Exception{
int x=-1,y=1,z=0;
BufferedWriter op = new BufferedWriter(new FileWriter("result.txt", true));
for(int i=0;i<n;i++) {
z=x+y;
op.write("\n");
op.write(String.valueOf(z));
x=y;
y=z;
}
op.close();
}
}
public class inhe extends process{
public static void main(String args[]) throws Exception 
{
File file=new File("input.txt");
Scanner scan = new Scanner(file);
int input = scan.nextInt();
process obj=new process();
obj.fibb(input);
}
}