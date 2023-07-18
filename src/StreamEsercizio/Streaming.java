package StreamEsercizio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {

    /*
    *  operatore   :: si usa per l invocazione di un metodo
    * NomeClasse::nomeMetodo
oggetto::nomeMetodo
*
* //l'invocazione di un costruttore della classe NomeClasse.
NomeClasse::new
*
*
*
    * */
//facilitano le operazioni sui dati
    public static void main(String[] args) {


        List<String> n = new ArrayList<>();

        // Stream<String> compa =Stream.<String>builder().

        //generate per creare gli stream in maniera dinamica

        /*
         *
         * Java Streams è una potente funzionalità introdotta in Java 8 che fornisce un approccio
         * semplificato e funzionale per elaborare raccolte di dati.
         *
         *
         * Fondamentalmente, uno stream rappresenta una sequenza di elementi che possono essere elaborati in parallelo o in sequenza
         *
         * Uno dei principali vantaggi dell'utilizzo dei flussi(Stream) è che promuovono uno stile di programmazione più funzionale,
         *  in cui i dati vengono
         * trasformati ed elaborati senza modificare la raccolta originale
         *
         *
         * possono essere creati da o i metodi factory statici nella classe Stream
         * o i metodi stream() o parallelStream() forniti dall'interfaccia Collection
         *
         *
         *
         *  Operazioni intermedie,
         *  come filter(), map() e sorted(), trasformano il flusso e restituisce un nuovo flusso
         *filter: possiamo aggiungere piu filtri
         *
         */

        System.out.println("Operazioni intermedie:");
List<Integer> num= Arrays.asList(2,34,56);
//da interi a stream
Stream<Integer> res=num.stream().filter(x->x>0);
res.forEach(System.out::println);

        System.out.println("Operazioni intermedie MAP:");
        List<Integer> ma= Arrays.asList(2,4,6);
//map mappa (trasforma) gli elementi di uno stream
        Stream<Object> resu=ma.stream().map( no -> no *2);
        resu.forEach(System.out::println);


        /*
         *
         *
         * Le operazioni del terminale,(return il risultato cercato)
         *  come forEach(), collect() e reduce(), consumano il flusso e producono un risultato o un effetto collaterale.
         *
         *.stream:trasformi in uno stream
         * .collect= trasf in una collezione
         *
         *  I flussi Java forniscono un modo elegante e conciso per eseguire la manipolazione e l'elaborazione dei dati
         *
         *
         * */

        // Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7);


        //COME CREARE GLI STREAM


        //stream di stringhe
        System.out.println("stream di stringhe");
        Stream<String> buildervero = Stream.<String>builder().add("lun").add("mart").build();
        buildervero.forEach(p -> System.out.println(p));

//System.out.println(buildervero.collect(Collectors.toList()));


        List<Integer> l = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
Stream<Integer> st =l.stream();
        System.out.println(l);


        //da array

        //

    }
}
