package support;

import java.util.Arrays;
import java.io.Serializable;//Must implements Serializable to be able to read the copy of such object.
public class Person implements Serializable {
    String name;

    int age;

    String gender;

    String [] ontherInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOntherInfo() {
        return ontherInfo;
    }

    public void setOntherInfo(String[] ontherInfo) {
        this.ontherInfo = ontherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ontherInfo=" + Arrays.toString(ontherInfo) +
                '}';
    }

    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
}
