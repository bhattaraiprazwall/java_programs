public class palindrome{
    public static void main (String []args){
        int num=545;
        int reverse=0;
        int remainder,original;
        original=num;
        
        while(num>0){
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num / 10;
        }
        if(original==reverse){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}