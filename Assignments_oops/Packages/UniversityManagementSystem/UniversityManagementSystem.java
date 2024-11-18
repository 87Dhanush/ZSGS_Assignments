import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", "CS101", 4);
        Course course2 = new Course("Data Structures", "CS102", 3);
        Course course3 = new Course("Database Systems", "CS103", 3);

        Student student1 = new Student("Dhanush", 1);
        Student student2 = new Student("Raj", 2);

        Faculty faculty1 = new Faculty("Surya", 101);
        Faculty faculty2 = new Faculty("Prakash", 102);

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);

        faculty1.assignCourse(course1);
        faculty1.assignCourse(course2);
        faculty2.assignCourse(course3);
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();

        faculty1.showAssignedCourses();
        faculty2.showAssignedCourses();
    }
}
