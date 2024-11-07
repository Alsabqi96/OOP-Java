package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentService {
    static Scanner scanner = new Scanner(System.in);

    public static Student addStudent() {

        Student student = new Student();
        System.out.println("Enter Student Id: ");
        student.id = scanner.nextLine();

        System.out.println("Enter Student Name: ");
        student.name = scanner.nextLine();

        System.out.println("Enter Student Grade: ");
        student.grade = scanner.nextLine();

        System.out.println("Enter Student Age: ");
        student.age = scanner.nextShort();

        student.courses = SubjectService.addSubjects();

        return student;
    }
    public static List<Student> addStudents() {
        Boolean flag = true;
        List<Student> students = new ArrayList<>();
        while (flag) {
            students.add(StudentService.addStudent());
        }
        return students;
    }
}




