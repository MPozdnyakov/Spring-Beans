package baseApp.model.service;

import baseApp.model.model.Student;
import baseApp.model.repository.StudentRepository;
import baseApp.model.repository.StudentRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mike on 2/24/2016.
 */
public class UniversityServiceImpl implements UniversityService{


    StudentRepository studentRepository;


    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public UniversityServiceImpl() {
    }

    public List<Student> getAvailableStudents (){
        return studentRepository.getStudents();
    }

}
