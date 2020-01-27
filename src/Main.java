public class Main {

    public static void main(String[] args) {

        CosinusCalculator cosCalculator = new CosinusCalculator();
        double result = cosCalculator.calculateWithForLoop(4, 7);
        System.out.println(result);


        result = cosCalculator.calculateWithWhile(4, 0.001);
        System.out.println(result);
        System.out.println(Math.cos(4));

/*
        ExponentaCalculator expCalculator = new ExponentaCalculator();
        double result = expCalculator.calculateWithForLoop(4, 7);
        System.out.print(result);


        result = expCalculator.calculateWithWhile(4, 0.001);
        System.out.println(result);
        */
    }
}


