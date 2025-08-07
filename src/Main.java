public class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;
    double average;
    char letterGrade;
    String isPassing;

    public Student(String Name, int Age, String Course, double Grade1, double Grade2, double Grade3) {
        name = Name;
        age = Age;
        course = Course;
        grade1 = Grade1;
        grade2 = Grade2;
        grade3 = Grade3;
        displayInfo();

    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        calculateAverage();
        getLetterGrade();
        isPassing();
    }

    public void calculateAverage() {
        average = (grade1 + grade2 + grade3) / 3;
        System.out.println("Average: " + average);
    }

    public void getLetterGrade() {
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("Letter Grade: " + letterGrade);
    }

    public void isPassing() {
        if (average >= 70) {
            isPassing = "PASSING";
        } else {
            isPassing = "FAILING";
        }
        System.out.println("Status: " + isPassing);
    }

    public static void main(String[] args) {
        System.out.println("Student Information:");
        Student student1 = new Student("Michael", 20, "BSIT", 75.0, 80.0, 90.0);
        Student student2 = new Student("Adam", 19, "BSA", 90.0, 85.0, 95.0);
        Student student3 = new Student("John", 21, "BSCE", 70.0, 70.0, 65.0);
        System.out.println("Summary: 2 out of 3 students are passing.");
    }
}
