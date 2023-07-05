import java.util.Scanner;

public class Exceptiom {


    public static void main(String[] args) {


        {


            Scanner s = new Scanner(System.in);

            try {
                Exceptiom e = new Exceptiom();
                e.checkScore(2.15);
                e.checkScore(50);
                e.checkScore(95.02);
                e.checkScore(100.01);

            } catch (ArithmeticException e) {
                System.out.println("non puoi inserire un numero che non è definito");

            }
        }
    }

        /*Define a method checkScore that takes a double score as input parameter

if 0 < score <= 50.00 then print Average score

if 50.00 < score <= 100.00 the print Very good score

in all other cases throw an ArithmeticException with the message Score is out of scale!

test the method with the following values:

2.15
50
95.02
100.01
        *
        * */

    private void checkScore(double score) {
        if (score>0 & score<=50.00)
        {
            System.out.println("Average score");
        }

        else if (score>50.00 & score <= 100.00)
            System.out.println("Very good score");
        else {

            throw  new ArithmeticException(" Score is out of scale!");
        }

    }

}
