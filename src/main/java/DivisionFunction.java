public class DivisionFunction implements SingleArgFunction{
    private double A;
    private double B;
    private double C;
    private double D;
    private double lowerBound;
    private double upperBound;
    public DivisionFunction(double A, double B, double C, double D, double lowerBound, double upperBound){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double calculate(double argument) {
        if(C*argument + D == 0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return (A*argument+B)/(C*argument+D);
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
