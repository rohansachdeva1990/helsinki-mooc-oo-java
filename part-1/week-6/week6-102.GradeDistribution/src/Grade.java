public class Grade {

    private int points;
    private int gradeLevel;

    public Grade(int points) {
        this.points = points;
        calculateGradeLevel(points);
    }

    private void calculateGradeLevel(int points) {
        if (points >= 0 && points <= 29) {
            this.gradeLevel = 0;
        } else if (points >= 30 && points <= 34) {
            this.gradeLevel = 1;
        } else if (points >= 35 && points <= 39) {
            this.gradeLevel = 2;
        } else if (points >= 40 && points <= 44) {
            this.gradeLevel = 3;
        } else if (points >= 45 && points <= 49) {
            this.gradeLevel = 4;
        } else if (points >= 50 && points <= 60) {
            this.gradeLevel = 5;
        }

        // else do nothing for values greater
    }

    public int getPoints() {
        return points;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

}
