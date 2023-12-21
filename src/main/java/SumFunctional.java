public class SumFunctional<T extends SingleArgFunction> implements FunctionalitySingleArg<T>{

    @Override
    public double calculateFunctional(T function) {
        double lowerBound = function.getLowerBound();
        double upperBound = function.getUpperBound();
        double middlePoint = (lowerBound + upperBound)/2;

        return function.calculate(lowerBound)+ function.calculate(upperBound)+ function.calculate(middlePoint);
    }
}
