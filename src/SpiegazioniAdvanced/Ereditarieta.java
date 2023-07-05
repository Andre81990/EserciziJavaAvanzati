package SpiegazioniAdvanced;

public class Ereditarieta {



    /*È il meccanismo in Java
    mediante il quale una classe può ereditare le caratteristiche (campi e metodi) di un'altra classe.
    *


    Overriding del metodo: l'overriding del metodo è realizzabile
     solo tramite l'ereditarietà. È uno dei modi in cui Java raggiunge il polimorfismo



      L'astrazione mostra solo la funzionalità all'utente


      Riusabilità: l' ereditarietà supporta il concetto di "riusabilità", ovvero quando
      vogliamo creare una nuova classe e c'è già una classe che include parte del codice
       che vogliamo, possiamo derivare la nostra nuova classe dalla classe esistente.
       In questo modo, stiamo riutilizzando i campi ei metodi della classe esistente.



       cosa si fa in una sottoclasse?

       Possiamo scrivere un nuovo metodo di istanza nella sottoclasse che abbia la stessa
       firma di quello nella superclasse,
       sovrascrivendolo ( come nell'esempio sopra, il metodo toString() è sovrascritto).

       Possiamo scrivere un nuovo metodo statico nella sottoclasse che abbia la stessa firma di quello nella superclasse, nascondendolo così .



       Ereditarietà dei costruttori: una sottoclasse eredita tutti i membri (campi, metodi e classi
       nidificate) dalla sua superclasse. I costruttori non sono membri, quindi non vengono ereditati
        dalle sottoclassi, ma il costruttore della superclasse può essere richiamato dalla sottoclasse.


Ereditarietà dei membri privati: una sottoclasse non eredita i membri privati ​​della sua classe
genitore. Tuttavia, se la superclasse ha metodi pubblici o protetti (come getter e setter) per accedere
ai suoi campi privati, questi possono essere usati anche dalla sottoclasse.

    * */

}
