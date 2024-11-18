package university.courses;

public class Course {
    private String courseName;
    private String courseCode;
    private int courseCredits;

    public Course(String courseName, String courseCode, int courseCredits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredits = courseCredits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    @Override
    public String toString() {
        return "Course{Name: " + courseName + ", Code: " + courseCode + ", Credits: " + courseCredits + "}";
    }
}
