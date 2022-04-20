public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void getAdditionRes() {
        double res = secondNumber + firstNumber;
        System.out.println("Addition of two Numbers is: " + res);
    }

    public void getSubtractionRes() {
        double res = secondNumber - firstNumber;
        System.out.println("Subtraction of two Numbers is: " + res);
    }

    public void getMultiplicationRes() {
        double res = secondNumber * firstNumber;
        System.out.println("Multiplication of two Numbers is: " + res);
    }

    public void getDivisonRes() {
        double res = secondNumber / firstNumber;
        System.out.println("Division of two Numbers is: " + res);
    }
}
