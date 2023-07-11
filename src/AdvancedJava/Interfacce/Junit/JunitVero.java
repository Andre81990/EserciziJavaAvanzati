package AdvancedJava.Interfacce.Junit;

public class JunitVero
{

    public static void main(String[] args) {
        JunitVero j=new JunitVero();

        j.Substraction(3,4);
        j.Multipication(34,2);

    }

    public static int Substraction(int minuend, int subtrahend)

    {
        return minuend - subtrahend;
    }

    public static int Multipication(int multiplier, int multiplicand)

    {
        return multiplier * multiplicand;
    }


}
