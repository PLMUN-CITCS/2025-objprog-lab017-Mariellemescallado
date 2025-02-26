import java.util.Scanner;

public class GradeCalculator {

    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score;

        while (true) {
            System.out.print("Enter student score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score >= 0) { 
                    break;
                } else {
                    System.out.println("Score cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical score.");
                scanner.next(); 
            }
        }
        scanner.close();
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        double studentScore = getStudentScore();
        String grade = calculateGrade(studentScore);
        System.out.println("The student's grade is: " + grade);
    }
}