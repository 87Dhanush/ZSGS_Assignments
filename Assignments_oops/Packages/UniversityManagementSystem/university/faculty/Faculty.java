package university.faculty;

import university.courses.Course;

public class Faculty {
    private String name;
    private int facultyId;
    private Course[] assignedCourses;

    public Faculty(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
        this.assignedCourses = new Course[5];     }

    public String getName() {
        return name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void assignCourse(Course course) {
        for (int i = 0; i < assignedCourses.length; i++) {
            if (assignedCourses[i] == null) {
                assignedCourses[i] = course;
                break;
            }
        }
    }

    public void showAssignedCourses() {
        System.out.println("Courses taught by "+name +":");
        for (Course course : assignedCourses) {
            if (course != null) {
                System.out.println(course.getCourseName());
            }
        }
    }

    @Override
    public String toString() {
        return "Faculty{Name: " + name +", ID: " +facultyId + "}";
    }
}
