import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimoArrList {


    public static void main(String[] args) {




        //ancbe cosi è ordinata
        List<String> primo = new ArrayList();
        primo.add("ciao");
        primo.add("sono");
        primo.add("andrea");
        primo.add("ottolino");
        primo.add("occhilupo");


        ///ciclare tramite iteratore
        Iterator itr = primo.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());



        }
    }


}
