package Second2CopyObject;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import support.Person;
public class writeObject {
    public static void main(String[] atgs){
        try{
            FileOutputStream fos = new FileOutputStream("Person.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Person person = new Person(19,"male","Perter Wang");
            oos.writeObject(person);
            oos.close();
        }catch(Exception e){
            String exception = e.getMessage();
            System.out.println(exception);
        }
    }

    
    
}
