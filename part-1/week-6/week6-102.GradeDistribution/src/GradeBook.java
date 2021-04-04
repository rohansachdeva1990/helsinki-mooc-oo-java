import java.util.Arrays;
import java.util.List;

public class GradeBook {

    private List<Grade> grades;
    private String[] gradeDistribution = new String[6];

    public GradeBook(List<Grade> grades) {
        this.grades = grades;
    }

    public void printDistribution() {
        createGradeDistribution();

        System.out.println("Grade distribution:");
        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            System.out.println(String.format("%d: %s", i, gradeDistribution[i]));
        }
    }

    private void createGradeDistribution() {
        Arrays.fill(gradeDistribution, "");
        for (Grade grade : grades) {
            gradeDistribution[grade.getGradeLevel()] += "*";
        }
    }

    public void printAcceptance() {

        int sum = 0;
        for (int i = 1; i < gradeDistribution.length; i++) {
            sum += gradeDistribution[i].length();
        }
        double acceptancePercentage;
        if (sum == 0) {
            acceptancePercentage = 0.0;
        } else {
            acceptancePercentage = (double) (sum * 100) / grades.size();
        }

        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }


}
