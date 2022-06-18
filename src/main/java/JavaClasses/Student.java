package JavaClasses;

import java.time.LocalDate;

public class Student {
    private int ID;
    private String surname;
    private String name;
    private String fatherName;
    private LocalDate dataBirthday;
    private String address;
    private String faculty;
    private int course;
    private int numGroup;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public LocalDate getDataBirthday() {
        return dataBirthday;
    }

    public void setDataBirthday(LocalDate dataBirthday) {
        this.dataBirthday = dataBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }


    public Student(int ID, String surname, String name, String fatherName, LocalDate dataBirthday, String address, String faculty, int course, int numGroup) {
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.dataBirthday = dataBirthday;
        this.address = address;
        this.faculty = faculty;
        this.course = course;
        this.numGroup = numGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dataBirthday='" + dataBirthday + '\'' +
                ", address='" + address + '\'' +
                ", faculty=" + faculty +
                ", course=" + course +
                ", numGroup=" + numGroup +
                '}';
    }
}
