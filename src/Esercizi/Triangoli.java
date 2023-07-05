package Esercizi;


/*
*
Descrizione dell'esercizio:
In questo esercizio, creeremo una classe "TriangoloRettangolo". Utilizzeremo concetti di incapsulamento, costruttori e variabili statiche per implementare le funzionalità richieste.

Traccia dell'esercizio:

    Definire la classe "TriangoloRettango" con i seguenti attributi privati:
        "nome" (stringa): nome del triangolo
        "lunghezzaCateto1" (decimale): la lunghezza di uno dei due lati corti
        "lunghezzaCateto2" (decimale): la lunghezza di uno dei due lati corti
        "lunghezzaIpotenusa" (decimale): la lunghezza del lato lungo
        *
        *
        *
        *
        *

    Implementare un costruttore che accetti come argomenti tutti gli attributi e inizializzi gli attributi corrispondenti.

    Implementare metodi "getter" e "setter" per gli attributi privati.

*
*
*
*
*
    - creare un metodo che restituisca l' area = (l1*l2)/2
    - creare un metodo che restituisca il perimetro = l1+l2+l3
    *
    *
    *
    *

    Creare un esempio di utilizzo della classe "TriangoloRettangolo" nel metodo "main" di
    *  una classe principale chiamata "Triangoli". Creare almeno due oggetti "TriangoloRettangolo" con diverse
    * caratteristiche,
    *
    *
    *
    *  inseriscili in una lista. Stampa il nome del triangolo, il suo perimetro e la sua area per
    *  ogni rettangolo presente nella lista


*
*
*
*
*
* */


import java.util.ArrayList;
import java.util.List;

public class Triangoli {


    public static void main(String[] args) {

TriangoloRettangolo tria=new TriangoloRettangolo("rettangolo1",2.3,4.5,5.6);
TriangoloRettangolo tria2=new TriangoloRettangolo("rettangolo2 ",2.6,5.8,1.7);


        List<TriangoloRettangolo> nuovaList=new ArrayList<>();
        System.out.println(nuovaList);



        //aggiunti i triangoli

         nuovaList.add(tria);
         nuovaList.add(tria2);


        for ( TriangoloRettangolo i:nuovaList)
        {
            System.out.println(i);
            System.out.println("i nomi dei triangoli sono : "+ i.getNome());

            System.out.println("il perimetro è " + i.calcolaPerimetro());
            System.out.println("l area è " + i.calcolaArea());
        }


    }
}
