package EqualsOverride;

public class TesterSma {

    public static void main(String[] args) {

        try {

            //PRODUCER
            SmartphonePrice smartprice1 = new SmartphonePrice("euro", 500);
            SmartphonePrice smartprice2 = new SmartphonePrice("zen", 460);


            //RETAIL
            SmartphonePrice retailprice3 = new SmartphonePrice("dollari", 230);
            SmartphonePrice retailprice4 = new SmartphonePrice("sterline", 280);

/*
* creare 2 nuovi oggetti, utilizzando i 4 oggetti Smartphone appena creati SmartphonePrice
* */
            Smartphone smart1 = new Smartphone("Cell", "pro", 3400, smartprice1 , retailprice3);
            Smartphone smart2 = new Smartphone("Cell2", "pro2", 5000, smartprice2, retailprice4);


            System.out.println("i dettagli del primo smartphone creato sono:" + smart1.toString());
            System.out.println("i dettagli del secondo smartphone creato sono:" + smart2.toString());



            if (smart1.equals(smart2)) {
                System.out.println("i due smarthphone sono uguali");
            } else {
                System.out.println("i due smarthphone non sono uguali");
            }


        Smartphone smartphoneClonato=smart2.clone();

System.out.println("i dettagli dello smarthphone clonato sono "+smartphoneClonato);


if (smart2.equals(smartphoneClonato)){

    System.out.println("il secondo smarthphone è uguale allo smartphone clonato");

}
else
{
    System.out.println("il secondo smarthphone non è uguale allo smartphone clonato");


}
    }


catch (Exception e)
{
    e.printStackTrace();
    System.out.println("si è verificata un eccezione nel programma java");
}

        /*
        * usa a try{ ... }
        * catch(Exception exception) { ... }per:
          ottenere un nuovo Smartphoneoggetto clonando il secondoSmartphone
          stampa in console tutti i dettagli dell'oggetto appena clonato
          verificare se il secondo smartphone è uguale all'oggetto appena clonato, informando l'utente
          all'interno dell'ambito catch(Exception exception) { ... } :
          stampa la traccia dello stack dell'eccezione
          informare l'utente dell'errore
*
        * */


    }
}