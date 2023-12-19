import java.util.function.Function;

public class RealizationInterface<T,R> implements FunctionalitySingleArg< FunctionalitySingleArg<T, R>, R> {
    private T start;
    private T end;
    public RealizationInterface(T start, T end){
        this.start = start;
        this.end = end;
    }

    @Override
    public R calculate(FunctionalitySingleArg<T, R> argument) {
        R valueStart = argument.calculate(start);
        R valueEnd = argument.calculate(end);

        return valueSum =
    }
}
