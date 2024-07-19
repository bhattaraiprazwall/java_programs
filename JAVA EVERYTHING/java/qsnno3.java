import java.util.Scanner;
public class qsnno3
{
    public static void main (String [] args)
    {
        float purchase,discount1,discount2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        purchase=sc.nextFloat();
        sc.close();

        discount1=5*purchase/100;
        discount2=3*purchase/100;
        if(purchase>=1000)
        {
            System.out.println("The discount allowed is: "+discount1);
        }
        else if(purchase<1000)
        {
            System.out.println("The discount allowed is: "+discount2);
        }

    }
}