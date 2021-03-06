/**
 * Created by mvieck on 12/22/16.
 */
public class ChildCalculator extends Calculator {
    public ChildCalculator() {
        super();
    }

    @Override
    public double add(double x, double y) {
        System.out.println("Overriding Add");
        return super.add(x, y);
    }

    @Override
    public double subtract(double x, double y) {
        System.out.println("Overriding Subtract");
        return super.subtract(x, y);
    }

    @Override
    public double divide(double x, double y) {
        System.out.println("Overriding Divide");
        return super.divide(x, y);
    }

    @Override
    public double multiply(double x, double y) {
        System.out.println("Overriding Multiply");
        return super.multiply(x, y);
    }

    public static void main(String[] args) {
        ChildCalculator childCalculator = new ChildCalculator();
        childCalculator.scanIntegers();
    }
}
