import java.util.Scanner;
public class exceptiontest
{
    public static void main (String[]args)
    {
        int divident,divisor,quotient;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divident and divisor");
        divident=sc.nextInt();
        divisor=sc.nextInt();
     try{
        quotient=divident/divisor;
        System.out.println("Quotient="+quotient);
        }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    catch(InputMismatchException p)
    {
        System.out.println(p);
    }
        System.out.print("The end");
        
    }
}