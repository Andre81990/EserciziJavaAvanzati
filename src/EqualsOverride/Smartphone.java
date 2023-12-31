package EqualsOverride;

import java.lang.management.ClassLoadingMXBean;
import java.util.Objects;
//equals
//hashcode
//tostring


public class Smartphone implements Cloneable {

    private String brandName;
    private String modelName;
    private int batterymAh;


    public SmartphonePrice producerPrice;
    public static SmartphonePrice retailPrice;



    public Smartphone(String brandName, String modelName, int batterymAh,
                      SmartphonePrice producerPrice,
                      SmartphonePrice retailPrice) {

        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }
//TOtring

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }
    //[usando IntelliJ] un override del equals() metodo che controlla tutti i 5 attributi per stabilire se due
// Smartphone oggetti sono uguali

    @Override
    public boolean equals(Object o) {

        //this si riferisce all oggetto
        if (this == o) return true;
        if (!(o instanceof Smartphone that))
            return false;

        return batterymAh == that.batterymAh &&
                Objects.equals(brandName, that.brandName)
                && Objects.equals(modelName, that.modelName)
                && Objects.equals(producerPrice, that.producerPrice)
                && Objects.equals(retailPrice, that.retailPrice);
    }

    //[usando IntelliJ] un override di hashCode(),
    // usando tutti i 5 attributi
    /*

    * Tale metodo fornisce un codice hash dell’oggetto ed è
    *  pensato per fornire supporto alla
    * gestione delle strutture dati

    hash --->
    *  di tipo hash table come ad esempio java.util.Hashtable
    *
    * La sua implementazione di default sostanzialmente non
    *  fa altro che
    *  mappare l’indirizzo dell’area di memoria
    * dove l’oggetto è allocato con un intero (univoco).
    * */



    //dice cosa andare a prendere
    //
    @Override
    public int hashCode() {

        return Objects.hash(brandName, modelName,
                batterymAh, producerPrice,
                retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {

        try {
            //cast
            //implementazione del metodo clone

            Smartphone SmartphoneClonato = (Smartphone) super.clone();

            //assegnamento
            SmartphoneClonato.producerPrice = producerPrice.clone();

            SmartphoneClonato.retailPrice = retailPrice.clone();

            return SmartphoneClonato;

        } catch //CloneNotSupportedException e
        (Exception e) {

            e.printStackTrace();
            return null;
        }

    }
}


