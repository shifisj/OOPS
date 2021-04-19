package currencyconversion;
import java.util.*;
public class Currency{
double inr,USD;
double Euro,yen;
Scanner in=new Scanner(System.in);
public void dollartorupee() {
    System.out.println("Enter Dollars to convert into Rupees");
    USD=in.nextInt();
    inr=USD*67;
    System.out.println("Dollars="+USD+"equal to inr="+inr);
}
public void rupeetodollar(){
    System.out.println("Enter Rupees to convert into Dollars");
    inr=in.nextInt();
    USD=inr/167;
    System.out.println("Rupees="+inr+"equal to Dollars="+USD);
}
public void eurotorupee() {
    System.out.println("Enter Euro to convert into Rupees");
    Euro=in.nextInt();
    inr=Euro*79.50;
    System.out.println("Euro="+Euro+"equal to inr="+inr);
}
public void rupeetoeuro() {
    System.out.println("Enter Rupees to convert into Euro");
    inr=in.nextInt();
    Euro=(inr/(79.50));
    System.out.println("Rupees="+inr+"equal to Euro="+Euro);
}
public void yentorupee() {
    System.out.println("Enter Yen to convert into Rupees");
    yen=in.nextInt();
    inr=(yen*0.61);
    System.out.println("Yen="+yen+ " equal to inr="+inr);
}
public void rupeetoyen() {
    System.out.println("Enter Rupees to convert into Yen");
    inr=in.nextInt();
    inr=(inr/(0.61));
    System.out.println("Rupees="+inr+"equal to Yen="+yen);
}
}
