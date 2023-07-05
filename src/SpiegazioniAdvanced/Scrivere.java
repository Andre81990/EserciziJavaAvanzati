package SpiegazioniAdvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Scrivere {

    public static void main(String[] args) {



        String content="ciao sono ";
        String fiePath="ciao.txt";

        try
        {
            Files.writeString(Path.of(fiePath),content);
    /*Se si desidera aggiungere la stringa a un file esistente invece di sovrascriverla, è possibile utilizzare l'opzione StandardOpenOption.APPEND come segue:
    Files.writeString(Path.of(filePath), content, StandardOpenOption.APPEND);
*/
            System.out.println("stringa scritta correttamente");
        }catch (IOException e)

        {
            System.out.println("C'è un errore "+e.getMessage());
        }
        /*prova 2*/

        /*
        String file="testpath";
        String ciao="Hello World";

        try {
            Files.writeString(Paths.get("/home/test/testpath"), "Hello World!", Charset.defaultCharset());
        } catch (IOException ioException) {
            logError("File could not be written.", ioException);
        }
    }
*/
        /*
         *  StringBuilderè una classe che fornisce un modo più efficiente per manipolare le stringhe che richiedono modifiche frequenti.
         *  A differenza della Stringclasse, che è immutabile e non può essere cambiata una volta creata, StringBuilderè mutabile
         *
         * */

//mappa
        // Map<String,Pasti> menu=new HashMap<>();

//la lista
        //List<Pasti> pasti=new ArrayList<>();
//pasti.add();

        StringBuilder s=new StringBuilder();

        for (int i=0;i< 100;i++)
        {

            //pasti.add(menu.get(new ArrayList<>(menu.keySet()).get()));
        }

//REFACTORING::pulizia
        // Ctrl+Alt+M


        //metodo split trasforma una string in un array

        //creare path come path.of

    }




}
