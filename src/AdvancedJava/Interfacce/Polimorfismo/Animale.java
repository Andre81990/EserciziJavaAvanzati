package AdvancedJava.Interfacce.Polimorfismo;

public class Animale


{


    public static void main(String[] args) {

        Animale a=new Animale("cane");
        a.animalSound();
        a.animalSound("low");
        a.animalSound("high");
        a.animalSound("eiendind");
    }


    private String animalName;


    public Animale(String animalName) {
        this.animalName = animalName;
    }
    public void  animalSound()

    {
        System.out.println("roar");
    }



    public void  animalSound(String intensity)


    // Nella classe figlia è possibile utilizzare la parola chiave super per richiamare il costruttore oi metodi della classe padre.
//polimorfismo, in cui oggetti di diverse classi derivate possono essere trattati come oggetti della classe base,
//L'ereditarietà dovrebbe essere utilizzata quando esiste una chiara relazione gerarchica e un comportamento condiviso tra le classi
    {

        if (intensity=="high")
            System.out.println("roarrrrr");
        else if (intensity=="low")
        {

            System.out.println("roar");
        }

        else {System.out.println("Cannot reproduce it properly");
        }

    }


}
