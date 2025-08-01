import java.util.Scanner;
public class LabActivity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        boolean valid = false;

        while (!valid){
            try {
                System.out.println("Enter number 1");
                num1 = scanner.nextInt();
                System.out.println("Enter number 2");
                num2 = scanner.nextInt();
                System.out.println("Enter number 3");
                num3 = scanner.nextInt();
                System.out.println("Enter number 4");
                num4 = scanner.nextInt();
                System.out.println("Enter number 5");
                num5 = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }

        int totalNum = num1 + num2 + num3 + num4 + num5;

        System.out.println(" ");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        System.out.println("Number 4: " + num4);
        System.out.println("Number 5: " + num5);
        System.out.println(" ");
        System.out.println("Total Number: " + totalNum);
        scanner.close();
    }
}
