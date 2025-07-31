import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Student ID");
        String id = scanner.nextLine();
        System.out.println("Please enter your First name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your Last name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your Course");
        String course = scanner.nextLine();
        System.out.println("Please enter your Section");
        String section = scanner.nextLine();
        System.out.println(" ");

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID:" + " " + id);
        System.out.println("Student name:" + " " + firstName + " " + lastName);
        System.out.println("Course:" + " " + course);
        System.out.println("Section:" + " " + section);
        System.out.println(" ");

        System.out.println("Please enter your Midterm Exam score");
        int midtermExamScore = scanner.nextInt();
        System.out.println("Please enter your Final Exam score");
        int finalExamScore = scanner.nextInt();
        System.out.println("Please enter your Project score");
        int projectScore = scanner.nextInt();
        System.out.println("Please enter your Attendance score");
        int attendanceScore = scanner.nextInt();
        int allOverScore = midtermExamScore + finalExamScore + projectScore + attendanceScore;
        int averageScore = allOverScore / 4;
        String remarks = (" ");
        if (averageScore < 75) {
            remarks = ("FAILED");
        } else {
            remarks = ("PASSED");
        }
        System.out.println(" ");
        
        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermExamScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Remarks: " + remarks);
    }
}
