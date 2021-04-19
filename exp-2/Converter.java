import java.util.*;
import java.io.*;
import currencyconversion.Currency;
import distanceconversion.Distance;
import timeconversion.Timer;

class Converter
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int choice,ch;
        Currency c=new Currency();
        Distance d=new Distance();
        Timer t=new Timer();
        do
        {
            System.out.println("1.Dollar to Rupee");
            System.out.println("2.Rupee to Dollar");
            System.out.println("3.Euro to Rupee");
            System.out.println("4.Rupee to Euro");
            System.out.println("5.Yen to Rupee");
            System.out.println("6.Rupee to Yen");
            System.out.println("7.Metre to Kilometer");
            System.out.println("8.Kilometer to Meter");
            System.out.println("9.Miles to Kilometers");
            System.out.println("10.Kilometers to Miles");
            System.out.println("11.Hours to Minutes");
            System.out.println("12.Hours to Seconds");
            System.out.println("13.Seconds to Hours");
            System.out.println("14.Minutes to Hours");
            System.out.println("Enter the choice");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:
                {
                    c.dollartorupee();
                    break;
                }
                case 2:
                {
                    c.rupeetodollar();
                    break;
                }
                case 3:
                {
                    c.eurotorupee();
                    break;
                }
                case 4:
                {
                    c.rupeetoeuro();
                    break;
                }
                case 5:
                {
                    c.yentorupee();
                    break;
                }
                case 6:
                {
                    c.rupeetoyen();
                    break;
                }
                case 7:
                {
                    d.mtokm();
                    break;
                }
                case 8:
                {
                    d.kmtom();
                    break;
                }
                case 9:
                {
                    d.miletokm();
                    break;
                }
                case 10:
                {
                    d.kmtomile();
                    break;
                }
                case 11:
                {
                    t.hourtominute();
                    break;
                }
                case 12:
                {
                    t.hourtosecond();
                    break;
                }
                case 13:
                {
                    t.secondtohour();
                    break;
                }
                case 14:
                {
                    t.minutetohour();
                    break;
                }
            }
                System.out.println("Enter 0 to quit and 1 to continue");
                ch=s.nextInt();
        }
        while(ch==1);
    }
}
