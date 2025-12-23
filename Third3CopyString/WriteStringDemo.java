package Third3CopyString;

import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteStringDemo {
    public static void main(String[] args) throws IOException{
        String string = "你好, my name is Peter Wang! 今日是2025年12月23日!";
        byte[] buf = string.getBytes(StandardCharsets.UTF_8);
        File file = new File("support.fis.txt");//cannot be ctreated under the support package!
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(buf);
        fos.close();
    }
}
