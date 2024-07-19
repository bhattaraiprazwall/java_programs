/*public class uppercase
{
    public static void main(String[]args)
    {
        String s="computer";
        char c=s.charAt(4);
        System.out.println(c);
    }
}

public class uppercase
{
    public static void main (String[]args)
    {
        String a="abc";
        String b="abc";
        String c="def";
        String d="DEF";
        int n=a.compareToIgnoreCase(b);
        boolean e=a.equals(b);
        System.out.print("the condition is\t"+e);
        System.out.println("\nthe difference is\n"+n);
    }
}

public class uppercase{
    public static void main(String[]args){
        String s1="Hello";
        String s2="world";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

    }
}

public class uppercase
{
    public static void main (String[]args)
    {
        String r="fhdsuf";
        boolean s=r.isEmpty();
        System.out.println(s);
        
    }
}
public class uppercase
{
    public static void main(String[]args)
    {
        String s=" fjejn     ";
        System.out.println(s.trim()+"fdfdf");
    }
}
public class uppercase
{
    public static void main(String[]args)
    {
        String s="hello world i am java";
        char[] ch=[10];
        try{
            s.getChars(6, 10, ch, 0);
            Sytem.out.println(ch);

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}*/
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
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
       
        System.out.println("The End");
    }
}