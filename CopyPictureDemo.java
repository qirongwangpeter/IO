import java.io.FileOutputStream;
import java.io.FileInputStream;
public class CopyPictureDemo {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("copyOfPicture.png");
            FileInputStream fis = new FileInputStream("picture.png");
            int len;
            byte[] buf = new byte[1024*100];
            long start = System.currentTimeMillis();
            while((len = fis.read(buf)) != -1){
                fos.write(buf,0,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("time used:" + (end - start));
            fos.close();
            fis.close();
        }catch(Exception exception){
            String e = exception.getMessage();
            System.out.println(e);
        }
        
    }
}
