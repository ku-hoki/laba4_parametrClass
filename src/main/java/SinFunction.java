import static java.lang.Math.sin;

public class SinFunction implements SingleArgFunction{
    private double A;
    private double B;
    private double lowerBound;
    private double upperBound;

    public SinFunction(double A, double B, double lowerBound, double upperBound){
        this.A = A;
        this.B = B;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double argument) {
        return A*sin(B*argument);
    }

    @Override
    public double getUpperBound() {
        return upperBound;
    }

    @Override
    public double getLowerBound() {
        return lowerBound;
    }
}
