package Third3CopyString;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
//import java.util.Arrays;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("support\\fos.txt");
        FileInputStream fis = new FileInputStream(file);
        long len = file.length();
        byte[] buf = new byte[(int)len];
        fis.read(buf);
        String result = new String(buf,StandardCharsets.UTF_8);
        //System.out.println(Arrays.toString(buf));
        System.out.println(result);
        fis.close();
    }
}
