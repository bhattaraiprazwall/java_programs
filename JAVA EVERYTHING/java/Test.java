import java.util.Scanner;
public class Test
{
    public static void main(String[] args) {

        int a,b,sum;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number :");
        a=sc.nextInt();

        System.out.println("Enter the second number :");
        b=sc.nextInt();

        sc.close();
        sum=a+b;
        System.out.println("The sum of a and b is :"+sum);
       

        
    }
}