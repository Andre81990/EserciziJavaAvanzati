package AdvancedJava.Interfacce;

public class CollegePerson
{
    public String name;
    public String surname;
    public int collegeId;

    public CollegePerson(String name, String surname,int collegeId) {

        this.name=name;
        this.surname=surname;
        this.collegeId=collegeId;
    }


    public void goToCollege()
    {

        System.out.println("il nome della persona iscritta " +
                " al college è : "+ name +" il suo cognome è "
                +surname + " e il suo id è "+ collegeId);
    }


}
