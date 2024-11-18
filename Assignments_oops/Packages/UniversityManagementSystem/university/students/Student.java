package university.students;

import university.courses.Course;

public class Student {
    private String name;
    private int studentId;
    private Course[] enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new Course[5]; 
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollInCourse(Course course) {
        for (int i = 0; i < enrolledCourses.length; i++) {
            if (enrolledCourses[i] == null) {
                enrolledCourses[i] = course;
                break;
            }
        }
    }

    public void showEnrolledCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : enrolledCourses) {
            if (course != null) {
                System.out.println(course.getCourseName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{Name: "+name + ", ID: "+ studentId+"}";
    }
}
