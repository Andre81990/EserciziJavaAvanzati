package EqualsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {


    public String priceType;
    public double priceInEuros;


    @Override
    public SmartphonePrice clone() {
        try

    {
        return (SmartphonePrice)super.clone();
    } catch(
    CloneNotSupportedException e)

    {
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


