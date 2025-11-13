package zExamplebyhariom;

public class Student {

    public String name;
    public String rollNo;
    public int age;
    private String address;

    public Student(String name,String rollNo,int age, String address){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.address = address;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}
