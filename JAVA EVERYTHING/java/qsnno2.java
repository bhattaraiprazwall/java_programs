import java.util.Scanner;
public class qsnno2{
public static void main(String[] args){
    float purchase,discount;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the purchase amount: ");
    purchase=sc.nextFloat();

    sc.close();

    discount=5*purchase/100;

    if(purchase>=1000)
    {
        System.out.println("The discount allowd is :"+discount);
    }
    else{
        System.out.println("No discount allowed ");
    }

}
}