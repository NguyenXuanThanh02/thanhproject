package B14_miniproject;

import B14_miniproject.controllers.StudentManager;
import B14_miniproject.moder.Student;
import B14_miniproject.services.StudentDataServices;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        
        String choose = null;
        boolean exit = false;
        
        StudentManager studentManager = new StudentManager("./resources/student-input.txt");
        
        showMenu();
        while (true) {

            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Add Student");
                    studentManager.addStudent(scanner);
                    break;
                case "2":
                    System.out.println("Edit Student");
                    System.out.println("Enter id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.editName(studentId);
                    break;
                case "3":
                    System.out.println("Delete Student");
                    System.out.println("Enter id: ");
                    studentId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.delete(studentId);
                    break;
                case "4":
                    System.out.println("Sort By Id");
                    studentManager.sortById();
                    break;
                case "5":
                    System.out.println("Sort By Name");
                    studentManager.sortByName();
                    break;
                case "6":
                    System.out.println("Students");
                    studentManager.showAll();
                    break;
                case "0":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose action");
                    break;
            }

            if (exit) {
                break;
            }

            showMenu();
        }

    }

    public static void showMenu() {

        System.out.println("---------------Menu---------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Sort students by id");
        System.out.println("5. Sort students by name");
        System.out.println("6. Show all students");
        System.out.println("0. Exit");
        System.out.println("----------------------------------");
        System.out.println("Please choose: ");
    }
    
}
