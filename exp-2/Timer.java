package timeconversion;
import java.util.*;
public class Timer
{
    int hours,seconds,minutes;
    int input;
    Scanner sc=new Scanner(System.in);
    public void secondtohour()
    {
        System.out.println("Enter the number of seconds:");
        seconds=sc.nextInt();
        hours=seconds/3600;
        System.out.println("Seconds:" +seconds);
        System.out.println("Hours:" +hours);
}
public void minutetohour()
{
    System.out.println("Enter the number of minutes");
    minutes=sc.nextInt();
    hours=minutes/60;
    System.out.println("Hours:"+hours);
    System.out.println("Minutes:"+minutes);
}
public void hourtominute()
{
    System.out.println("Enter the number of hours");
    hours=sc.nextInt();
    minutes=(hours*60);
    System.out.println("Minutes:"+minutes);
}
public void hourtosecond()
{
    System.out.println("Enter the number of hours");
    hours=sc.nextInt();
    seconds=(hours*3600);
    System.out.println("Minutes:"+seconds);
}
}
