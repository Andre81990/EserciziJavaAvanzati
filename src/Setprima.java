import java.util.*;

public class Setprima {




    public static void main(String[] args) {
        Set<String> daysWeek = new HashSet<String>();


        System.out.println("questo è un hashset :");

        daysWeek.add("lunedi");
        daysWeek.add("martedi");
        daysWeek.add("mercoledi");
        daysWeek.add("giovedi");
        daysWeek.add("venerdi");
        daysWeek.add("sabato");
        daysWeek.add("domenica");

        for (String d : daysWeek) {

            System.out.println(d);

        }

        System.out.println("questo è il treeset :");


        TreeSet<String> giorni = new TreeSet<String>();
        giorni.add("lunedi");
        giorni.add("martedi");
        giorni.add("mercoledi");
        giorni.add("giovedi");
        giorni.add("venerdi");
        giorni.add("sabato");
        giorni.add("domenica");


        //associato l iteratore ai giorni
        Iterator<String> itr = giorni.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());




            System.out.println("linked : ");
            LinkedHashSet<String> gio = new LinkedHashSet<String>();
            System.out.println("questo è linkedhaskset :");
            gio.add("lunedi");
            gio.add("martedi");
            gio.add("mercoledi");
            gio.add("giovedi");
            gio.add("venerdi");
            gio.add("sabato");
            gio.add("domenica");

            System.out.println(gio);


            System.out.println("Is the first Set equal to the second one?");


            //qua fai il confronto tra treeset e linked hash set
            System.out.println(daysWeek.equals(giorni));



        }
    }


}
