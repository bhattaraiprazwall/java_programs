// // 0 and 1 are not prime numbers
// import java.util.Scanner;
// public class prime_composite{
//     public static void main(String []args){
//         int number;
//         Scanner sc=new Scanner(System.in);

        
//         System.out.println("Enter the number to check: ");
//         number=sc.nextInt();

//         if(number/number==1 && number/1==number){
//             System.out.println(number + "is a prime number");
//         }
//         else{
//             System.out.println(number + "is a composite number");
//         }
//     }
// }

public class prime_composite{
    public static void main(String []args){
        int num=100;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is not a prime number");
        }

    }
}