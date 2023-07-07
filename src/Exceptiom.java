import java.io.IOException;
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

                //perche non mi da le altre stampe?
                e.checkScore(200);
                e.checkScore(34532);

            } catch (ArithmeticException e) {
                //con questo messagge richiamo il throw
                System.out.println(e.getMessage());
                System.out.println("non puoi inserire un numero che non è definito");

            }
        }
    }


    private void checkScore(double score)  {
        if (score>0 & score<=50.00)
        {
            System.out.println("Average score");
        }
        else if (score>50.00 && score <= 100.00) {
            System.out.println("Very good score");
        }
        else {
            throw  new ArithmeticException(" Score is out of scale!");
             }
    }

}
