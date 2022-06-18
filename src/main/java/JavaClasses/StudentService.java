package JavaClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentService {private final ArrayList<Student> studentList;

    public StudentService()
    {
        studentList = StudentService.Generator();
    }


    public static ArrayList<Student> Generator() {


        Student st1 = new Student(12345, "Иванов", "Иван", "Иванович", LocalDate.of(2000, 12, 11), "Минск", "Физика", 3, 1);
        Student st2 = new Student(12346, "Петров", "Петр", "Петрович", LocalDate.of(2001, 1, 3
        ), "Минск", "Физика", 3, 1);
        Student st3 = new Student(12347, "Сидоров", "Иван", "Иванович", LocalDate.of(1998, 4, 3), "Минск", "Математика", 1, 4);
        Student st4 = new Student(12348, "Машкова", "Иван", "Иванович",
                LocalDate.of(1998, 9, 14), "Минск", "Иностранный язык", 2, 4);
        Student st5 = new Student(12349, "Дибарева", "Иван", "Иванович", LocalDate.of(2000, 8, 9), "Могилев", "Математика", 4, 3);
        Student st6 = new Student(12350, "Талебиан", "Сэм", "_________", LocalDate.of(2000,2,1), "Гомель", "Физика", 5, 2);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        studentArrayList.add(st6);

        return studentArrayList;
    }

    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    public ArrayList<Student> all()
    {
        return studentList;
    }

    public ArrayList<Student> getFaculty(String facultyName)
    {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : studentList)
        {
            if (student.getFaculty().equals(facultyName))
            {
                result.add(student);
            }
        }
        return result;
    }





    public ArrayList<Student> getNumGroup(int numGroup )
    {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : studentList)
        {
            if (student.getNumGroup() == numGroup)
            {
                result.add(student);
            }
        }
        return result;
    }


    public ArrayList<Student> getFacultyCourse  (String facultyName,int course) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : this.studentList) {
            if (student.getFaculty().equals(facultyName) && student.getCourse() == course) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList <Student> getLowAge(LocalDate dataBirthday){
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : this.studentList) {
            if (student.getDataBirthday().isAfter(dataBirthday))
            {
                result.add(student);
            }
        }
        return result;


    }

//     public void printAge(ArrayList<Student>studentArrayList, LocalDate dataBirthday){
//         for (Student s : studentArrayList){
//             if (s.getDataBirthday().isAfter(LocalDate.of(2000,1,1)))
//                 System.out.println();
//
//             System.out.println(s);
//         }
//         System.out.println();
//     }
//
//
}
