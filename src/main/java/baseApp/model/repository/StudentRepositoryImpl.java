package baseApp.model.repository;

import baseApp.model.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 2/24/2016.
 */
public class StudentRepositoryImpl implements StudentRepository{
    public List<Student> getStudents () {
        List <Student> students = new ArrayList<Student>();

        Student student = new Student("River", "Song", 25);
        Student student2 = new Student("Smith", "John", 35);
        students.add(student);
        students.add(student2);
        return students;
    }


}
