import java.util.Scanner;
public class LabActivity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int i = 0;
        boolean valid = false;
        while (!valid){
            try {
                for (i = 0; i < 5; i++){
                System.out.println("Enter number " + (i+1));
                num[i] = scanner.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
            if (i > 4){
                valid = true;
            }
        }
        int totalNum = num[0] + num[1] + num[2] + num[3] + num[4];
        System.out.println(" ");
        for (i = 0; i < 5; i++) {
            System.out.println("Number " + (i+1) + ": " + num[i]);
        }
        System.out.println(" ");
        System.out.println("Total Number: " + totalNum);
        scanner.close();
    }
}
