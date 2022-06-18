package JavaClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class InOut {
    private static StudentService studentService;

    public static void main(String[] args) {
        studentService = new StudentService();
        boolean isExit = false;
        do {
            System.out.println("1 - Add student to list;");
            System.out.println("2 - Print all students;");
            System.out.println("3 - Print students of faculty;");
            System.out.println("4 - Print student of group");
            System.out.println("5 - Print students Faculty and Course");
            System.out.println("6 - Print student younger then.....");

            System.out.println("0 - Exit");
            System.out.print("Enter command:");
            Scanner scannerID = new Scanner(System.in);
            int commandKey = scannerID.nextInt();

            switch (commandKey) {
                case 1 -> {
                    createStudentCommand();
                    break;
                }
                case 2 -> {
                    printList(studentService.all());
                    break;
                }
                case 3 -> {
                    getFacultyCommand();
                    break;
                }
                case 4 -> {
                    getGroupCommand();
                    break;
                }
                case 5 -> {
                    getFacultyCourseCommand();
                    break;
                }
                case 6 -> {
                    getLowAgeCommand();
                    break;
                }
                case 0 -> isExit = true;
            }
        }
        while (!isExit);
    }

    private static void createStudentCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = scanner.nextInt();


        scanner.nextLine();


        System.out.println("Enter surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();


        System.out.println("Enter fatherName:");
        String fatherName = scanner.nextLine();

        System.out.println("Enter dataBirthday 'dd/mm/yyyy':");
        LocalDate dataBirthday = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //DateTimeFormatter.ofPattern("dd/MM/yyyy"
        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Enter faculty:");
        String faculty = scanner.nextLine();

        System.out.println("Enter course:");
        int course = scanner.nextInt();


        System.out.println("Enter numGroup:");
        int numGroup = scanner.nextInt();
        studentService.addStudent(new Student(id, surname, name, fatherName, dataBirthday, address, faculty, course, numGroup));
    }

    private static void getFacultyCommand() {
        System.out.println("ВВедите факультет");
        Scanner scanner = new Scanner(System.in);
        String facultyName = scanner.nextLine();
        printList(studentService.getFaculty(facultyName));
    }

    private static void getGroupCommand() {
        System.out.println("Введите номер группы");
        Scanner scanner = new Scanner(System.in);
        int numGroup = scanner.nextInt();
        printList(studentService.getNumGroup(numGroup));
    }


    private static void getFacultyCourseCommand() {
        System.out.println("Введите факультет");
        Scanner scanner = new Scanner(System.in);
        String facultyName = scanner.nextLine();
        System.out.println();
        System.out.println("Введите номер курса");
        Scanner scanner1 = new Scanner(System.in);
        int course = scanner1.nextInt();

        printList(studentService.getFacultyCourse(facultyName, course));
    }


    private static void getLowAgeCommand() {
        System.out.println("Введите год в формате год.месяц.день");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        LocalDate dataBirthday = LocalDate.parse(age);

        printList(studentService.getLowAge(dataBirthday));
    }


    private static void printList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
