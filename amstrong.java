public class amstrong{
    public static void main(String []args){
        int num=371;
        int remainder;
        int original=num;
        int result=0;

        while(num>0){
            remainder=num%10;
            result=result+(remainder*remainder*remainder);
            num=num/10;
        }
        if(original==result){
            System.out.println(original + " is a amstrong number");
        }
        else{
            System.out.println(original + " is not a amstrong number");   
        }

    }
}