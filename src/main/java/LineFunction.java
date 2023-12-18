public class LineFunction implements SingleArgFunction{
    private double A;
    private double B;
    private double lowerBound;
    private double upperBound;

    public LineFunction(double A, double B, double lowerBound, double upperBound){
        this.A = A;
        this.B = B;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double argument) {
        return A*argument + B;
    }

    @Override
    public double getLowerBound() {
        return lowerBound;
    }

    @Override
    public double getUpperBound() {
        return upperBound;
    }
}
