package oopsKeywords.StaticKeyword;

public class Student {

    int rollNo;
    static String schoolName = "ABC School";  // shared by all students

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", School: " + schoolName);
    }

    static void changeSchool(String newName) {
        schoolName = newName;  // can modify static variable
    }

    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);

        s1.display();
        s2.display();

        Student.changeSchool("XYZ Public School"); // calling static method using class name

        s1.display();
        s2.display();
    }
}

