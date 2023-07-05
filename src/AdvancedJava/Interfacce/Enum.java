package AdvancedJava.Interfacce;

public class Enum {
    /*
     *
     *  Gli enum possono essere utilizzati nelle istruzioni switch
     *  L'obiettivo principale di un enum è definire i nostri tipi di dati (tipi di dati enumerati).
     *
     * Ogni costante enum è sempre implicitamente public static final . Poiché è static ,
     *  possiamo accedervi utilizzando l'enum Name. Poiché è final , non possiamo creare enumerazioni figlio.
     *
     * */


    enum Mesi {JANUARY,FEBRUARY,MARCH,APRIL};

    public static void main(String[] args) {
//ottenere la lunghezza
        for (Mesi m:Mesi.values()
        ) {

            String nomeFineMese=m.name();

            if (nomeFineMese.endsWith("Y"))
            {System.out.println("termina con y");
            }

            else if (nomeFineMese.endsWith("H")){
                System.out.println("non finisce con y");


            }
            else {

                System.out.println("no solution");
            }



        }

    }


}
