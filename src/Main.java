public class Main {

    public static void main(String[] args) {

        SinusCalculator sinusCalculator = new SinusCalculator();
        double result = sinusCalculator.calculateSinusWithForLoop(4, 7);
        System.out.print(result);


        result = sinusCalculator.calculateWithWhile(4, 0.001);
        System.out.println(result);
    }
}
