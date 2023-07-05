package SpiegazioniAdvanced;

public class BigInteger {


    public BigInteger(String number) {

    }

    /*
     *
     *Record: i record sono una nuova funzionalità introdotta
     * in Java 14 (anteprima) e successivamente finalizzata in Java 16
     *
     *
     *
     * . Forniscono un modo conciso per dichiarare le classi utilizzate
     *  principalmente per contenere dati immutabili
     *
     *
     *
     * operatore ternario
     *condizione ? valore_se_vero : valore_se_falso

     *
     *
     * BigInteger: BigInteger è una classe nel pacchetto java.math di Java che
     * fornisce l'aritmetica dei numeri interi con precisione arbitraria

     *
     *
     * Link
     * Gli operatori costituiscono l'elemento base di qualsiasi linguaggio di programmazione
     *
     * variabile = Espressione1 ? Espressione2: Espressione3 --->?v :f
     *
     *
     *         max = (n1 > n2) ? n1 : n2;

     *
     *primob=45;
     * secondob=56;
     * bilanciere MAX =(primob>secondob) ? 45:56;
     *
     *
     *
     * si puo usare anche i BOOL

*
*
*
 BigInteger utilizza internamente un array di numeri interi per l'elaborazione, l'operazione su un oggetto
 * di BigIntegers non è veloce come sui primitivi che sono add funzione
 * su BigIntegers non richiede il tempo costante che impiega il tempo proporzionale alla lunghezza di BigInteger     *
     * */
    public static void main(String[] args) {


        BigInteger B = new BigInteger("4948568784");

        System.out.println(B);
    }


}