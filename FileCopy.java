import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class FileCopy{
    public static void main(String []args) throws IOException{
        FileInputStream  r=new FileInputStream("C:\\Users\\Prajwal Bhattarai\\Desktop\\copydata.txt");
        FileOutputStream w =new FileOutputStream("C:\\Users\\Prajwal Bhattarai\\Desktop\\copydata1.txt");

        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
            
        }
        System.out.println("Data copy successfull");
    }
}