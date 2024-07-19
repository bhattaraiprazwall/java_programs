import java.lang.Math;
public class areaofcircle
{
	public static void main(String[]args)
		{
			double area,radius,circumference;		
			radius=Double.parseDouble([0]);
			circumference=Math.PI*2*radius;
			area=Math.PI*radius*radius;
			System.out.println("The circumference of circle is :" +circumference);
			System.out.println("The area of circle is :" +area);
		}
}
	