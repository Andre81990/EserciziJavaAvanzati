import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("primo num :");

            int x = s.nextInt();

            System.out.println("secondo num :");

            int y = s.nextInt();

            int res=x/y;
            System.out.println("ottengo :" + res);
        } catch (ArithmeticException e) {
            System.out.println("non si puo fare");
        }
        /*i blocchi try-catch, puoi rendere i tuoi programmi
         Java più robusti e resilienti, gestendo le eccezioni con garbo
         e fornendo una migliore esperienza utente*/
        catch (InputMismatchException e)
        // finally {
        {
            System.out.println("non si puo fare con la stringa");
        }


        finally {
            System.out.println("si esegue sempre, bravo hai finito il tuo try catch");
        }






        /*
        * Eccezioni non controllate: non vengono controllate in fase di compilazione ma in fase di esecuzione.
        *
        * quelle non controllate non c'è bisogno di gestirle
        * Ad esempio: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, eccezioni sotto Errorclasse, ecc.
           Eccezioni controllate: vengono controllate in fase di compilazione. Ad esempio, IOException, InterruptedException, ecc.
        *
        *
        *
        * qui serve il throw-throws
        *
        *
        * La throw parola chiave viene utilizzata per generare in modo esplicito una singola eccezione.
        *
        *
        * class Main {
  public static void findFile() throws IOException {
    throw new IOException("File not found");
  }

  public static void main(String[] args) {
    try {
      findFile();
      System.out.println("Rest of code in try block");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
        */
    }

}
