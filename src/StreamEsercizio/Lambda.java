package StreamEsercizio;

import java.util.Comparator;

public class Lambda
{

    //oggetto di classe anonima
    public static void main(String[] args)
    {

        //ui funzionale

        Comparator<String> c = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
            //espressione lambda  parametri del metodo -> implementazione del metodo astratto
            //sintetizza quello che è un oggetto di classe anonima
            //Comparator <String> c = (String o1,String o2)->o1.length()-o2.length();
            //exp lambda applicabile su ogg di classe anonima che implementano ui funzionali
            //ui che possiedono un solo met astratto,e sono generics

        };

         Comparator<String> compa=(String s1,String s2) -> s1.length()-s2.length();
        System.out.println(compa.compare("neioepo","napo"));


        /*exp tecnica per creare ogg di
        * classe anonima
        * */

    }
}
