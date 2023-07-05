package SpiegazioniAdvanced;

public class Override {



    /*
    *
    * L'override del metodo è uno dei modi in cui Java ottiene il polimorfismo in fase di esecuzione
    *
    *
    * è il tipo dell'oggetto a cui si fa riferimento (non il tipo della variabile di riferimento)
    * che determina quale versione di un metodo sottoposto a override verrà eseguita.
    *
    *
    *
    * I metodi privati ​​non possono essere sovrascritti poiché sono legati durante la compilazione.
    *  Pertanto non possiamo nemmeno sovrascrivere i metodi privati ​​in una sottoclasse
    *
    *
    *
    *
    * Possiamo chiamare il metodo della classe genitore nel metodo di override usando la parola chiave super .
    *
    *
    *
    * Exception e override
    *
    * Se il metodo di override della superclasse non genera un'eccezione, il metodo
    * di override della sottoclasse può solo generare l' eccezione non verificata ,
    *  il lancio di un'eccezione verificata porterà a un errore in fase di compilazione.
    *
    *
    * Metodo override e sincronizzato/strictfp
La presenza di un modificatore sincronizzato/strictfp con il metodo non ha alcun effetto sulle
*  regole di override, ovvero è possibile
*  che un metodo sincronizzato/strictfp possa sovrascriverne uno non sincronizzato/strictfp e viceversa.
    *
    *
    *
    *
    * . L'overload è un esempio di polimorfismo in fase di compilazione e l'override è un esempio di polimorfismo in fase di esecuzione .
     *
     * consente a una classe generale di specificare metodi che saranno comuni a tutte le sue derivate, consentendo alle sottoclassi
     * di definire l'implementazione specifica di alcuni o tutti quei metodi. I
     *
     *
     *
     * una superclasse può definire la forma generale dei metodi che verranno utilizzati da tutte le sue sottoclassi.
     * */


}
