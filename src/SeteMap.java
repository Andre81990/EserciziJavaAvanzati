import java.util.*;

public class SeteMap {



    public static void main(String[] args) {

//ordinato :solo linkedHash



        Map<String,Integer> months=new LinkedHashMap<String,Integer>();

        months.put("gennaio",1);
        months.put("febbraio",2);
        months.put("marzo",3);
        months.put("aprile",4);
        months.put("maggio",5);
        months.put("giugno",6);
        months.put("luglio",7);
        months.put("agosto",8);
        months.put("settembre",9);
        months.put("ottobre",10);
        months.put("novembre",11);
        months.put("dicembre",12);

        System.out.println(months);


        //ottenere e stampare una Set vista delle chiavi che si trovano utilizzando un metodo months specifico Map

        System.out.println("stampo le chiavi : ");
        for (String g:months.keySet()) {
            System.out.println(g);
        }


        /*
        *
        * quindi convertire months utilizzando a Collection di numeri interi:

---in a List(e stampalo) di interi chiamati cardinalMonth  dove inserisci tutti i valori di the Map

---in un array (e stampalo) di numeri interi chiamati cardinalMonthArray dove inserisci tutti i valori delMap
*
*/
        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.println("stampo la lista di interi: " + cardinalMonth);

        //valore months size
        Integer[] cardinalMonthArray = new Integer[months.size()];
        months.values().toArray(cardinalMonthArray);
        System.out.println("stampo l array di interi: " + Arrays.toString(cardinalMonthArray));


    }


}
