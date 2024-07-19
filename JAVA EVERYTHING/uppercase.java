import java.util.InputMismatchException;
import java.util.Scanner;
public class uppercase
{
    public static void main(String[]args)
    {
        int dvd,div,quo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dvd and div :");
        div=sc.nextInt();
        dvd=sc.nextInt();
        try{
            quo=dvd/div;
            System.out.println(quo);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
        System.out.println("The End");
    }
}