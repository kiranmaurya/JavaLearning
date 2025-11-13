package zExamplebyhariom;

public class Driver {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student("anu" ,"43343" ,18,"newdelhi");
        stu1.setName("Hariom");
        stu1.setAge(23);
        stu1.setAddress("gzb");
        stu1.setRollNo("3543");

        stu2.setName("kiran");
        stu2.setAge(20);
        stu2.setAddress("Delhi");
        stu2.setRollNo("4234243");

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        System.out.println(stu3.toString());

    }
}
