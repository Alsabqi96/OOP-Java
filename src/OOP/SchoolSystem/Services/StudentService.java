package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Student;
import OOP.SchoolSystem.Entities.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentService {
    static Scanner scanner = new Scanner(System.in);

    public static Student addStudent() {

        Student student = new Student();
        System.out.println("Enter Student Id: ");
        student.setId(scanner.nextLine());

        System.out.println("Enter Student Name: ");
        student.setName(scanner.nextLine());


        System.out.println("Enter Student Grade: ");
        student.setGrade(scanner.nextLine());


        System.out.println("Enter Student Age: ");
        student.setAge(scanner.nextShort());

        List<Subject>studentCourses = SubjectService.addSubjects(false);

        return student;
    }
    public static List<Student> addStudents() {
        Boolean flag = true;
        List<Student> students = new ArrayList<>();
        while (flag) {
            students.add(StudentService.addStudent());
            System.out.println("Enter N to exit from student, Enter Any Key to continue");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag = false;
            }
        }

        return students;
    }
}




