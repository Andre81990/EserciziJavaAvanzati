package EqualsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {

    public String priceType;
    public double priceInEuros;



    @Override
    public SmartphonePrice clone() throws  CloneNotSupportedException {
        try
    {
        /*
        * a clonedSmartphonePrice viene generato utilizzando super.clone()
        *  il valore restituito è un SmartphonePriceoggetto
        * */
        //seconda implementazione del metodo clone
        return (SmartphonePrice)super.clone();}
        //clonedSmartphonePrice

        catch(CloneNotSupportedException e)
    {
        e.printStackTrace();

        return null;


    }
}
    //tostring
        @Override
        public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

//equals
/*
* [usando IntelliJ] un override del equals()metodo
*  che controlla i 2 attributi
* per stabilire se due SmartphonePriceoggetti sono uguali
* */
        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartphonePrice that)) return false;

            SmartphonePrice other = (SmartphonePrice) o;

            return Double.compare(that.priceInEuros, priceInEuros)
                    == 0 && Objects.equals(priceType, that.priceType);
    }


    //HASHCODE
        @Override
        public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }


    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }
    }


