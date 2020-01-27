public class CosinusCalculator
{
    public double calculateWithForLoop(double x, int addendNumber)
    {
        double numerator = 1D; //числитель
        double denominator = 1D; //знаменатель
        double result = 1D; //полученный косинус
        double sign = -1D; //знак перед слагаемым
        for (int currentAddend = 2; //число для факториала в занменателе
             currentAddend <= addendNumber * 2; // addendNumber - количество слагаемых
             currentAddend += 2)//делаем четные числа для знаменателя

        {
            numerator *= x * x; //делаем х в степени
            denominator *= (currentAddend - 1) * currentAddend; //делаем факториал
            result += sign * numerator / denominator;
            sign = -sign;
        }
        return result;
    }

    public double calculateWithWhile(double x, double precision)
    {
        double numerator = 1D;
        double denominator = 1D;
        double result = 1D;
        double currentAddend = 2D;
        double sign = -1D;

        numerator *= x * x;
        denominator *= (currentAddend - 1) * currentAddend;
        double addend = sign * numerator / denominator; // дробь
        sign = -sign;
        currentAddend += 2;

        while (addend > precision || addend < -precision)
        {
            result += addend;
            numerator *= x * x;
            denominator *= (currentAddend - 1) * currentAddend;
            addend = sign * numerator / denominator;
            sign = -sign;
            currentAddend += 2;
        }
        return result;
    }
}
