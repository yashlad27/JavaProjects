import java.util.*;
import java.io.*;

public class SumCalculator {
    public static void main(String[] args)throws IOException {
        System.out.println("SIMPLE CALCULATOR");
        SimpleCalculator cal = new SimpleCalculator();

        cal.setFirstNumber(6.89);
        cal.setSecondNumber(5.32);
        cal.getAdditionRes();
        cal.getSubtractionRes();
        cal.getMultiplicationRes();
        cal.getDivisonRes();
    }
}

