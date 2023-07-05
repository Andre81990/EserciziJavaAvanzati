package AdvancedJava.Interfacce;

public class Student extends CollegePerson implements Learning
{

    public int academicYear;



    //costruttore
    public Student(int academicYear,String name,String surname,int collegeId) {
        super(name,surname,collegeId);
        this.academicYear = academicYear;

    }


    public void studyAtHome() {
        System.out.println("lo studente studia a casa o in aula studio");
    }



}
