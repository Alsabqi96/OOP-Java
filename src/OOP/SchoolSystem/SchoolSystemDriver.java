package OOP.SchoolSystem;

import OOP.SchoolSystem.Services.LibraryService;
import OOP.SchoolSystem.Services.SchoolService;
import OOP.SchoolSystem.Services.TeacherService;


import java.util.Scanner;

public class SchoolSystemDriver {

    public static void main(String[] args) {

        System.out.println(" School Details");
        SchoolService.addSchool();

        System.out.println("Teacher Details");
        TeacherService.addTeacher();

        System.out.println("Library Details");
        LibraryService.addLibrary();


    }

}





