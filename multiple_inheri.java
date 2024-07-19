interface A{
    void display1();
}
interface B{
    void display2();
}
class Multiple_inheri implements A,B
{   
    public void display1(){
        System.out.println("Hello World 1");
    }
    public void display2(){
        System.out.println("Hello World 2");
    }
    public static void main(String []args){
        Multiple_inheri m =new Multiple_inheri();
        m.display1();
        m.display2();
    }
}