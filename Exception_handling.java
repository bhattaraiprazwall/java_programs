import java.util.Scanner;
public class Exception_handling{
public static void main(String []args){
    int num1,num2,result;
    Scanner sc=new Scanner(System.in);

    try{
        System.out.println("Enter the dividend");
        num1=sc.nextInt();

        System.out.println("Enter the dividend");
        num2=sc.nextInt();

        result=(num1/num2);
        System.out.println("The result is " +result);
    }
    catch(ArithmeticException e){
        System.out.println( "Error:Division by 0 is not allowed");

    } finally{
        sc.close();
    }
}
}