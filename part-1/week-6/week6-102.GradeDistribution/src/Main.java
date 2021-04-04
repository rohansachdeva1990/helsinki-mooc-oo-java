import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Grade> grades = readGrades(scanner);
        GradeBook gradeBook = new GradeBook(grades);
        gradeBook.printDistribution();
        gradeBook.printAcceptance();
    }

    private static List<Grade> readGrades(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        List<Grade> grades = new ArrayList<Grade>();

        while (true) {
            int points = Integer.parseInt(scanner.nextLine());
            if (points == -1) {
                break;
            } else if (points < 0 || points > 60) {
            } else {
                grades.add(new Grade(points));
            }
        }
        return grades;
    }

}
