package AdvancedJava.Interfacce;

public class Assistente extends  CollegePerson implements Learning,TeachingPerson

{

    boolean isGoingToBeAPhD=true;

    public Assistente(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    public Assistente(String name, String surname, int collegeId) {
        super(name, surname, collegeId);



    }

    @Override
    public void studyAtHome() {

        System.out.println("l assistente studia dove vuole");

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("l assistente insegna ad altri studenti e apprende dall insegnante tutor");

    }
}
