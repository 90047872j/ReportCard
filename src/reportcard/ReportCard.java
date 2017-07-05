package reportcard;

/**
 *
 * @author Juan Tavera
 */
public class ReportCard {

    private final String SCHOOL_NAME = "BULLWORTH ACADEMY";
    private int studentID;
    private String lastName;
    private String firstName;
    private String currentCourse;
    private String[] subjects;
    private double[] courseGrades;
    
    private ReportCard() {
    }

    private ReportCard(int studentID, String lastName, String firstName, String currentCourse, String[] Subjects, double[] courseGrades) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.currentCourse = currentCourse;
        this.subjects = Subjects;
        this.courseGrades = courseGrades;
    }

    public double[] getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(double[] courseGrades) {
        this.courseGrades = courseGrades;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] Subjects) {
        this.subjects = Subjects;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return SCHOOL_NAME;
    }

    @Override
    public String toString() {
        return SCHOOL_NAME + "\n"
                + "\nStudent ID: " + studentID + "\n"
                + "Name: " + getLastName() + ", " + getFirstName() + "\n"
                + "Grade Level: " + getCurrentCourse() + "\n" + "\nSubjects:\n"
                + subjects[0] + ": " + courseGrades[0] + "\n"
                + subjects[1] + ": " + courseGrades[1] + "\n"
                + subjects[2] + ": " + courseGrades[2] + "\n"
                + subjects[3] + ": " + courseGrades[3] + "\n";
    }
}
