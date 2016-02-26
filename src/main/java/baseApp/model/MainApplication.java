package baseApp.model;

import baseApp.model.model.Student;
import baseApp.model.service.UniversityService;
import baseApp.model.service.UniversityServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mike on 2/24/2016.
 */
public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        UniversityService universityService = applicationContext.getBean("universityService", UniversityService.class);

        List<Student> students =universityService.getAvailableStudents();

        for(Student student : students){
            System.out.println(student.getLastName() + " "+student.getFirstName()+ " "+student.getAge()+
            " " + " years old");
        }
    }
}
