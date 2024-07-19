import java.util.Scanner;
public class areaandperimeter
{
    public static void main (String[] args)
    {
        int l,b,area,perimeter;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the rectangle :");
        l=sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        b=sc.nextInt();

        sc.close();
        area=l*b;
        perimeter=2*(l+b);
        System.out.println("The area and perimeter of the given rectangle is :"+area);
        System.out.println("The perimeter of the given rectangle is :"+perimeter);
    }
}