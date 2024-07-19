class Customer{
    int amount =5000;
    // for Withdrawal block 
    synchronized void withdrawal(int amount){
        System.out.println("Withdrawal begins");
        if(this.amount < amount){
            System.out.println("Insufficient balance to withdraw");
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.amount -=amount;
        System.out.println("Withdrawal completed:" + amount);
    }

    // for deposit block
    synchronized void deposit(int amount)
    {
        System.out.println("Deposit Begins");
        this.amount +=amount;
        System.out.println("Amount deposited successfully:"+ amount);
        notify();
    }
}

public class InterThread{
    public static void main(String []args)
    {
        final Customer c= new Customer();
        new Thread()
        {
            public void run()
            {
                c.withdrawal(5500);
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                c.deposit(2000);
            }
        }.start();

    }
}