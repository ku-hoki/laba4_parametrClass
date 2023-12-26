import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.PI;

public class FunctionTest {

    @Test
    public void SumFunctionalTest() {
        LineFunction lineFunction = new LineFunction(1, 3, 1 , 5);
        SumFunctional<LineFunction> sumFunctional = new SumFunctional<>();
        double expectedSum = lineFunction.calculate(1) + lineFunction.calculate(5) + lineFunction.calculate(3);
        double actualSum = sumFunctional.calculateFunctional(lineFunction);
        System.out.println(actualSum);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void SumFunctionalTestSin() {
        SinFunction sinFunction = new SinFunction(1 , 2, 0, PI);
        SumFunctional<SinFunction> sumFunctional = new SumFunctional<>();
        double expectedSum = sinFunction.calculate(0) + sinFunction.calculate(PI) + sinFunction.calculate(PI/2);
        double actualSum = sumFunctional.calculateFunctional(sinFunction);
        System.out.println(actualSum);
        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void SumFunctionalTestDivision() {
        DivisionFunction divisionFunction = new DivisionFunction(1, 2, 1, -1, 1, 5);
        SumFunctional<DivisionFunction> sumFunctional = new SumFunctional<>();
        double expectedSum = divisionFunction.calculate(1) + divisionFunction.calculate(5) + divisionFunction.calculate(3);
        double actualSum = sumFunctional.calculateFunctional(divisionFunction);
        System.out.println(actualSum);
        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void SumFunctionalTestExponent() {
        ExponentFunction exponentFunction = new ExponentFunction(1, 0, 1, 5);
        SumFunctional<ExponentFunction> sumFunctional = new SumFunctional<>();
        double expectedSum = exponentFunction.calculate(1) + exponentFunction.calculate(5) + exponentFunction.calculate(3);
        double actualSum = sumFunctional.calculateFunctional(exponentFunction);
        System.out.println(actualSum);
        assertEquals(expectedSum, actualSum);
    }


    @Test
    public void IntegralFunctionalTest(){
        LineFunction lineFunction = new LineFunction(5, 1, 1, 5);
        DefiniteIntegralFunctional<LineFunction> integralFunctional = new DefiniteIntegralFunctional<>(1, 5);
        double expectedResIntegral =  64;
        double actualResIngeral = integralFunctional.calculateFunctional(lineFunction);
        assertEquals(expectedResIntegral, actualResIngeral, 0.00001);
    }
    @Test
    public void IntegralFunctionalTestSin(){
        SinFunction sinFunction = new SinFunction(6 , 3, PI, 2*PI);
        DefiniteIntegralFunctional<SinFunction> integralFunctional = new DefiniteIntegralFunctional<>(PI, 2*PI);
        double expectedIntegral = -4;
        double actualIntegral = integralFunctional.calculateFunctional(sinFunction);
        assertEquals(expectedIntegral, actualIntegral, 0.01);
    }
    @Test
    public void IntegralFunctionalTestDivision(){
        DivisionFunction divisionFunction = new DivisionFunction(1 , 1, 2, 1 , 1, 5);
        DefiniteIntegralFunctional<DivisionFunction> integralFunctional = new DefiniteIntegralFunctional<>(1, 5);
        double expectedIntegral = 2.32482;
        double actualIntegral = integralFunctional.calculateFunctional(divisionFunction);
        assertEquals(expectedIntegral, actualIntegral, 0.1);
    }
    @Test
    public void IntegralFunctionalTestExponent() {
        ExponentFunction exponentFunction = new ExponentFunction(1, 0, 0, 1); // A = 2, B = 3
        DefiniteIntegralFunctional<ExponentFunction> integralFunctional = new DefiniteIntegralFunctional<>(0, 1);
        double expectedIntegral = Math.exp(1) - 1;
        double actualIntegral = integralFunctional.calculateFunctional(exponentFunction);
        assertEquals(expectedIntegral, actualIntegral, 0.001);
    }

}