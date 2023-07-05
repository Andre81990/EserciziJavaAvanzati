package Javabase;

import java.util.Arrays;
import java.util.Scanner;

public class Housesetget {

    public static void main(String[] args) {


        Housesetget house=new Housesetget();

        Scanner sc=new Scanner(System.in);

        System.out.println("inserisci tutto qui prima l indirizzo , poi i piani della casa e infine il nome dei residenti poi schiaccia invio dopo ogni inserimento :");



        String indirizzo=sc.nextLine();
        house.setAddress(indirizzo);

        int numberOfFloors= sc.nextInt();
        house.setNumberOfFloors(numberOfFloors);
//uso nextline perche'  cosi mi fa continuare a inserire dati
        //ho visto che dopo aver inserito un int il nextInt
        //non fa inserire una nuova riga
        sc.nextLine();


        String nomideiPr=sc.nextLine();
        String[] nomideVeriPr = nomideiPr.split(",");

        house.setResidentsNames(nomideVeriPr);






        System.out.println(" il numero numero di stanze è :" +
                house.getNumberOfFloors() + " l indirizzo è : " +
                house.getAddress()+ " il nome dei residenti sono : " +
                Arrays.toString(house.getResidentsNames()));


///format metodo
        String resid="andrea";
        System.out.println(String.format("inserisco il nome %s uno dei residenti con il format" ,resid,resid.length()));


//String s1=String.format("il primo residente si chiama %s" + house.getResidentsNames());
//System.out.println(s1);


        sc.close();
    }


    private void setResidentsNames() {
    }


    public String[] getResidentsNames() {
        return residentsNames;
    }
    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //devono ritornare un intero da passare allo scanner come nextInt()
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    private String[] residentsNames ;
    private String address;
    private int numberOfFloors;



    // placeholder %s %d
    //impagina una stringa il format

}

