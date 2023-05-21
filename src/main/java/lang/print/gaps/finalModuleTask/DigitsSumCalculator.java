package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num1 = number / 1000;
        int num2 = number % 1000 / 100;
        int num3 = number % 100 / 10;
        int num4 = number % 10;
        System.out.println(num1 + num2 + num3 + num4);
    }
}
