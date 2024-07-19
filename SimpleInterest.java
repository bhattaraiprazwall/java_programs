import java.util.Scanner;
public class SimpleInterest{
	public static void main(String []args){
		
			
		float p,t,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal");
		p=sc.nextFloat();

		System.out.println("Enter rate");
		r=sc.nextFloat();
		
		System.out.println("Enter time");
		t=sc.nextFloat();

		si=(p*t*r)/100;
		System.out.println("SimpleInterest is "+si);
	}

}
