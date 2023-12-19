import java.util.function.Function;

public class RealizationInterface<T extends SingleArgFunction> implements  FunctionalitySingleArg<T>{

    @Override
    public double Functional(T function) {
        double lowerBound = function.getLowerBound();
        double upperBound = function.getUpperBound();
        double middlePoint = (lowerBound + upperBound)/2;

        return function.calculate(lowerBound) + function.calculate(upperBound) + function.calculate(middlePoint);
    }


    }
}
