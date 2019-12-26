public class SinusCalculator {

    public double calculateSinusWithForLoop(int x, int addendNumber) {
/* int x - степень
int addendNumber - количество слагаемых
 */
        double result = 1D;
        double numerator = 1D;
        double denominator = 1D;
        int currentAddend;
        for (currentAddend = 2; currentAddend <= addendNumber; currentAddend++) {
            numerator = numerator * x;
            denominator *= (currentAddend - 1);
            result += numerator/denominator;
        }
        return result;
    }

    public double calculateWithWhile(int x, double precision) {
        double result = 1D;
        double numerator = x;
        double denominator = 1D;
        double addend = numerator/denominator;
        int addendNumber = 2;
        while(addend > precision){
            result += addend;
            numerator *= x;
            denominator *= addendNumber;
            addend = numerator/denominator;
            addendNumber++;
        }
        return result;
    }
}
