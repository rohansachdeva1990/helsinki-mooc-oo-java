package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        assertNonNegative(fromInteger);

        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {

        assertNonNegative(setSize);
        assertNonNegative(subsetSize);

        if (subsetSize > setSize) {
            throw new IllegalArgumentException();
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }


    private void assertNonNegative(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }
}
