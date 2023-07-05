import java.util.HashMap;
import java.util.Map;

public class MappeEsercizio {


    public static void main(String[] args) {


        HashMap<Integer,String> primo=new HashMap<Integer,String>();

        primo.put(1,"one");
        primo.put(2,"two");
        primo.put(3,"three");
        primo.put(4,"four");
        primo.put(5,"five");

        System.out.println("prima map: "+primo);

        HashMap<Integer,String> secondo=new HashMap<Integer,String>();
        secondo.put(1,"uno");
        secondo.put(3,"tre");
        secondo.put(5,"cinque");
        secondo.put(7,"sette");
        secondo.put(9,"nove");

        System.out.println("seconda map:"+secondo);


        //unire due hashmap senza il merge

        //1. Utilizzo putAll() metodo
//stampa uil nuovo Hashmap
        Map<Integer,String> nuovaMap=new HashMap<Integer,String>();
        nuovaMap.putAll(primo);
        nuovaMap.putAll(secondo);
        System.out.println("mappe unite:"+nuovaMap);

// stampa a video il valore dei tasti 5, 6, 7, 8 e 9

        //if else


        /*
        System.out.println("sto stampando i valori delle chiavi : ");
        Map<Integer,String> terza=new HashMap<Integer,String>();
        terza.put(5,"cinque");
        terza.put(6,"sei");
        terza.put(7,"sette");
        terza.put(8,"otto");
        terza.put(9,"nove");
*/


//for (Map.Entry<String, Integer> entry : map.entrySet()) itera la mappa
        /*
        for (Map.Entry <Integer,String> entry: primo.entrySet())
        {
            System.out.println(entry);

        }

        */


        System.out.println("stampo i valore da 5 a nove:");
        //chiavi
        int[] cinqueaNove={5,6,7,8,9};

        for (int k: cinqueaNove)
        {
            primo.putIfAbsent(k,"no associated value");
            System.out.println(k);
        }


        System.out.println("Stampo i valori : ");
        for (Map.Entry<Integer,String> s: primo.entrySet())
        {
            if(s.getKey()>=5 && s.getKey()<=9)
            {System.out.println("associato"+s.getKey()+"="+s.getValue());}
        }

        //se non esiste una mappatura per una chiave specifica, stampa No associated value


    }


}
