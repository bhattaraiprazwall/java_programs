import java.util.Scanner;
public class qsnno4
{
    public static void main (String [] args)
    {
        float purchase,discount1,discount2,discount3,discount4,discount5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        purchase=sc.nextFloat();
        sc.close();

        discount1=10*purchase/100;
        discount2=7*purchase/100;
        discount3=5*purchase/100;
        discount4=3*purchase/100;
        discount5=2*purchase/100;



        if(purchase>=5000)
        {
            System.out.println("The discount allowed is 1: "+discount1);
        }
        else if (purchase>=4000||purchase<5000)
        {
            System.out.println("The discount allowed is 2: "+discount2);
        }
        else  if(purchase>=3000||purchase<4000)
        {
            System.out.println("The discount allowed is 3: "+discount3);
        }
        else if(purchase>=2000||purchase<3000)
        {
            System.out.println("The discount allowed is 4: "+discount4);
        }
        else
        {
            System.out.println("The discount allowed is 5: "+discount5);
        }

    }
}