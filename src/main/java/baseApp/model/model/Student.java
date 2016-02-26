package baseApp.model.model;

/**
 * Created by Mike on 2/24/2016.
 */
public class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName,  int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
