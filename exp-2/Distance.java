package distanceconversion;
import java.util.*;
public class Distance
{
    double km,m,miles;
    Scanner sc=new Scanner(System.in);
    public void kmtom()
    {
        System.out.println("Enter in km");
        km=sc.nextDouble();
        m=(km*1000);
        System.out.println(km+ "km"+ "equal to" +m+"metres");
    }
    public void mtokm()
    {
        System.out.println("Enter in meter");
        m=sc.nextDouble();
        km=(m/1000);
        System.out.println(m+"m"+"equal to"+km+"kilometers");
    } 
    public void miletokm()
    {
        System.out.println("Enter in miles");
        miles=sc.nextDouble();
        km=(miles*1.60934);
        System.out.println(miles+"miles"+"equal to"+km+"kilometres");
    }
    public void kmtomile()
    {
        System.out.println("Enter in km");
        km=sc.nextDouble();
        miles=(km*0.621371);
        System.out.println(km+"km"+"equal to "+miles+"miles");
    }
}
