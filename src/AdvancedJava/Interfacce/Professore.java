package AdvancedJava.Interfacce;

public class Professore extends  CollegePerson implements TeachingPerson {





    public String teachingSubject;

    public void teachToOtherPeople() {
        System.out.println("il professore insegna agli alunni");
    }


    public Professore(String teachingSubject,String name,String surname,int idCollege) {
        super(name,surname,idCollege);
        this.teachingSubject = teachingSubject;
    }


}
