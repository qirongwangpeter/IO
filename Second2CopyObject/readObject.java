package Second2CopyObject;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import support.Person;
public class readObject {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("Person.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person)ois.readObject();
            System.out.println(person);
            ois.close();
        }catch(Exception e){
            String exception = e.getMessage();
            System.out.println(exception);
        }
        

    }
}
