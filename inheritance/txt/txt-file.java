import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
abstract class fibb{
public abstract void fi(int n);
}
public class abst extends fibb {
public void fi(int n){
try {
int x=-1,y=1,z=0;
BufferedWriter op = new BufferedWriter(new FileWriter("D:/result.txt", true));
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
File file=new File("D:/input.txt");
Scanner scan = new Scanner(file);
int input = scan.nextInt();
process obj=new process();

obj.fibb(input);
scan.close();

}
}

INPUT (filename :input.txt) OUTPUT (filename:result.txt)