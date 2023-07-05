package EqualsOverride;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* utilizzo dell'interfaccia comparatore: l'interfaccia
*  comparatore viene utilizzata per ordinare gli oggetti di una classe definita dall'utente.
*
* contiene 2 metodi compare(Object obj1, Object obj2) ed equals(Object element)
* */
public class Compa {

    public static void main(String[] args) {


        List<Student> lis=new ArrayList<Student>();
lis.add(new Student(111,"paolo","turin"));
lis.add(new Student(12,"polo","tuin"));
lis.add(new Student(11,"pao","tur"));
lis.add(new Student(151,"paolo","milan"));



System.out.println("unsorted");


        for (int i = 0; i <lis.size(); i++) {
            System.out.println(lis.get(i));



            Collections.sort(lis,
                    new Sortbyroll());

            System.out.println("\nSorted by rollno");



            for (i = 0; i < lis.size(); i++)
                System.out.println(lis.get(i));

            Collections.sort(lis, new Sortbyname());
            System.out.println("\nSorted by name");



            for (i = 0; i < lis.size(); i++)
                System.out.println(lis.get(i));
        }

    }

}
