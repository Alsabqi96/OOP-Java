package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.School;
import OOP.SchoolSystem.Entities.Student;
import OOP.SchoolSystem.Entities.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SchoolService {
        static Scanner scanner = new Scanner(System.in);

        public static School addSchool() {

            School school = new School();
            System.out.println("Enter School Name: ");
            school.setName(scanner.nextLine());

            System.out.println("Enter School Address: ");
            school.setAddress(scanner.nextLine());

           List<Student> schoolStudents = StudentService.addStudents();

            return school;
        }

        public static List<School> addSchools() {
            Boolean flag = true;
            List<School> schools = new ArrayList<>();
            while (flag) {
                schools.add(SchoolService.addSchool());
            }
            return schools;

        }
    }


