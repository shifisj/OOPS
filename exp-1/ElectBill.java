import java.util.Scanner;
class ElectBill
{
    int ConsumerNum;
    String ConsumerName;
    int PrevReading;
    int CurrReading;
    String EBConn;
    double Bill;
    void inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter consumer number:");
        ConsumerNum=sc.nextInt();
        System.out.println("Enter consumer name:");
        ConsumerName=sc.next();
        System.out.println("Enter previous units:");
        PrevReading=sc.nextInt();
        System.out.println("Enter current units consumed:");
        CurrReading=sc.nextInt();
        System.out.println("Enter the type of EB connection");
        EBConn=sc.next();
    }
    double calculatebill()
    {
        int choice;
        if(EBConn =="domestic")
        choice=1;
        else
        choice=2;
        switch(choice){
            case 1:
             if(CurrReading >0 && CurrReading<=100)
             Bill=(CurrReading*1);
             else if(CurrReading>100 && CurrReading<=200)
             Bill=((100*1)+(CurrReading-100)*2.50);
             else if (CurrReading >200 && CurrReading<=500)
             Bill=(100*1)+(100*2.50)+((CurrReading-200)*4);
             else
             Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*6);
            break;
            case 2:
             if(CurrReading >0&& CurrReading<=100)
             Bill=(CurrReading*2);
             else if(CurrReading>100&&CurrReading<=200)
             Bill=((100*1)+(CurrReading-100)*4.50);
             else if (CurrReading >200&&CurrReading<=500)
             Bill=(100*1)+(100*2.50)+((CurrReading-200)*6);
             else
             Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*7);
            break;
        }
        return Bill;
    }
    void display()
    {
        System.out.println("Electricity Bill");
        System.out.println("Consumer Number:"+ ConsumerNum);
        System.out.println("Consumer Name:"+ ConsumerName);
        System.out.println("Consumer Previous units:"+ PrevReading);
        System.out.println("Consumer Current units:"+ CurrReading);
        System.out.println("Type of EB connection:"+ EBConn);
        System.out.println("Total amount:"+ Bill);
    }
}
class main{
    public static void main(String[] args)
        {
        int ConsumerNum;
        String ConsumerName;
        int PrevReading;
        int CurrReading;
        String EBConn;
        ElectBill obj = new ElectBill();
        obj.inputdata();
        obj.calculatebill();
        obj.display();
        }
}