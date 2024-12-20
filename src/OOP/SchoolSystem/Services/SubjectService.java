package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Mark;
import OOP.SchoolSystem.Entities.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectService {
    static Scanner scanner = new Scanner(System.in);
    public static Subject addSubject(Boolean isTeacher) {

        Subject subject = new Subject();
        System.out.println("Enter Subject Name: ");
        subject.setName(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter Credit Hours: ");
        subject.setCreditHours(scanner.nextShort());

        if (!isTeacher){
            System.out.println("Enter marks for subjects");
            List<Mark> subjectMarks = MarkService.addMarks();
            subject.setMarks(subjectMarks);
        }

        return subject;
    }

    public static List<Subject> addSubjects(Boolean isTeacher) {
        Boolean flag = true;
        List<Subject> subjects = new ArrayList<>();
        while (flag) {
            subjects.add(SubjectService.addSubject(isTeacher));
            System.out.println("Enter N to exit for subject, Enter Any Key to continue");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag = false;
            }
        }

        return subjects;
    }
}


