public class StudentHierarchy {
    public static void main(String[] args) {
        ZSGSStudent zsgsStudent = new ZSGSStudent("Dhanushraj", 21, "Chidambaram", "Java Full Stack");
        zsgsStudent.displayDetails();

        Student studentAsParent = new ZSGSStudent("Surya", 22);
        studentAsParent.displayDetails();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent class constructor called");
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

class ZSGSStudent extends Student {
    private String city;
    private String course;

    public ZSGSStudent(String name, int age, String city, String course) {
        super(name, age);
        this.city = city;
        this.course = course;
        System.out.println("Child class constructor called");
    }

    public ZSGSStudent(String name, int age) {
        super(name, age);
        System.out.println("Child class constructor with fewer parameters called");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("City: " + city + ", Course: " + course);
    }
}
