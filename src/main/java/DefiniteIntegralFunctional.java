public class DefiniteIntegralFunctional<T extends SingleArgFunction> implements FunctionalitySingleArg<T> {//функционал определенного интеграла
    private double lowerLimit;
    private double upperLimit;

    public DefiniteIntegralFunctional(double lowerLimit, double upperLimit){
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public double calculateFunctional(T function) {
        double FunctionalLowerBound = function.getLowerBound();//наименьшее значение аргумента функции
        double FunctionalUpperBound = function.getUpperBound();//наибольшее значение аргумента функции
        if (FunctionalLowerBound > upperLimit || FunctionalUpperBound < lowerLimit){
            throw new IllegalArgumentException("Область определения функции не содержится в отрезке [a, b]");
        }

        double interval = (upperLimit- lowerLimit)/1000000; // для интегрирования будем использовать 100 прямоугольников под интегралом
        double integral = 0;

        for (double x = lowerLimit; x <upperLimit; x += interval){
            integral += function.calculate(x)*interval;
        }
        return integral;
    }
}
