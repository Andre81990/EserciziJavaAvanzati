package SpiegazioniAdvanced;

public class Record {


    /*
    *un record è un tipo speciale di dichiarazione
    * di classe volto a ridurre il codice boilerplate.
            *
            *modo veloce per creare classi portanti di dati
    * come POJO e DTO
    *
            *
            * se vuoi usare l'oggetto con strutture di dati come
            * HashMap o stampare il contenuto dei suoi oggetti come
    * una stringa, dovremmo eseguire l'override
            * di metodi come equals(), hashCode() e toString().
            *
            *
            *
            *
            * Un record può implementare le interfacce.
            * I record sono serializzabili.

    ma internamente la differenza di prestazioni tra un record e una classe non è così ampia
     *
             *
             *
             * public record Employee(int id, String firstName, String lastName) {}
    *
            * Crea i nostri costruttori. Nei record è possibile creare un costruttore parametrizzato, che chiama il costruttore predefinito con i parametri forniti all'interno del suo corpo. Puoi anche creare costruttori compatti simili ai costruttori predefiniti con la possibilità di aggiungere alcune funzionalità extra come i controlli all'interno del corpo del costruttore.
    Creare metodi di istanza. Come qualsiasi altra classe, puoi creare e chiamare metodi di istanza per la classe record.
    Crea campi statici. I record ci limitano a scrivere le variabili di istanza solo come parametri ma consentono l'uso di variabili statiche e metodi statici.
            *
            *
            *
            * conversione da classe speciale a classe java
    *
            *
            */
}
