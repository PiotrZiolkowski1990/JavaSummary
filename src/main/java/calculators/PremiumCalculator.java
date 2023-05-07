package calculators;

public class PremiumCalculator extends Calculator {
    public double pow(double x, double y) {
        double result = Math.pow(x, y);
        addOperation(x + " to the power of " + y + " is " + result);
        return result;
    }
}
