package AdvancedJava.Interfacce;

public class Test {



    public static void main(String[] args) {


        Assistente a=new Assistente("Pinco","Pallino",342,true);
        Professore p=new Professore("informatica","mario","montrucchio",001);
        Student s=new Student(4,"andrea","ottolino",364);

        a.goToCollege();
        p.goToCollege();
        s.goToCollege();


        a.studyAtHome();
        a.teachToOtherPeople();


        p.teachToOtherPeople();

        s.studyAtHome();

    }


}
