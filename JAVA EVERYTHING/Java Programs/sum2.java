import java.util.Scanner;
public class sum2
{
	public static void main(String[] args)
	{
		int x,y,sum;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Type your first number");
		x=myObj.nextInt();

		System.out.println("Type the second number");
		y=myObj.nextInt();
	
		sum=x+y;
		System.out.println("The sum is :" +sum);
	}
}