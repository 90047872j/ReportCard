package reportcard;

public class ReportCardProject {

    public static void main(String[] args) {
        ReportCard jimmyReportCard = new ReportCard();
        String subjects[] = {"Physics", "Maths", "English", "Art"};
        double grades[] = {4.3, 2.2, 5.9, 8.9};
        jimmyReportCard.setStudentID(21123);
        jimmyReportCard.setFirstName("James");
        jimmyReportCard.setLastName("Hopkins");
        jimmyReportCard.setCurrentCourse("10th D");
        jimmyReportCard.setSubjects(subjects);
        jimmyReportCard.setCourseGrades(grades);
        System.out.println(jimmyReportCard);
    }
}
