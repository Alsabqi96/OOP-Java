package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeacherService {
    static Scanner scanner = new Scanner(System.in);
    public static Teacher addTeacher() {

        Teacher teacher = new Teacher();
        System.out.println("Enter Teacher Name: ");
        teacher.name = scanner.nextLine();

        System.out.println("Enter Teacher ID: ");
        teacher.id = scanner.nextLine();

        System.out.println("Enter Years of Experience: ");
        teacher.yearsOfExperience = scanner.nextShort();

        teacher.subjectsExpertiseList = SubjectService.addSubjects(true);


        return teacher;
    }

    public static List<Teacher> addTeachers() {
        Boolean flag = true;

        List<Teacher> teachers = new ArrayList<>();
        while (flag) {
            teachers.add(TeacherService.addTeacher());
            System.out.println("Enter N to exit from Teacher, Enter Any Key to continue");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag = false;
            }
        }
        return teachers;
    }
}