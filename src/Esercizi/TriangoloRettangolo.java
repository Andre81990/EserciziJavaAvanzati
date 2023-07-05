package Esercizi;

public class TriangoloRettangolo {

    private  String nome;
    private  double lunghezzaCateto1;

    private double lunghezzaCateto2;
    private  double lunghezzaIpotenusa;


    //costruttore


    public TriangoloRettangolo(String nome, double lunghezzaCateto1, double lunghezzaCateto2, double lunghezzaIpotenusa) {
        this.nome = nome;
        this.lunghezzaCateto1 = lunghezzaCateto1;
        this.lunghezzaCateto2 = lunghezzaCateto2;
        this.lunghezzaIpotenusa = lunghezzaIpotenusa;
    }


    //getter e setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLunghezzaCateto1() {
        return lunghezzaCateto1;
    }

    public void setLunghezzaCateto1(double lunghezzaCateto1) {
        this.lunghezzaCateto1 = lunghezzaCateto1;
    }

    public double getLunghezzaCateto2() {
        return lunghezzaCateto2;
    }

    public void setLunghezzaCateto2(double lunghezzaCateto2) {
        this.lunghezzaCateto2 = lunghezzaCateto2;
    }

    public double getLunghezzaIpotenusa() {
        return lunghezzaIpotenusa;
    }

    public void setLunghezzaIpotenusa(double lunghezzaIpotenusa) {
        this.lunghezzaIpotenusa = lunghezzaIpotenusa;
    }

    public double calcolaArea()
    {
        //(l1*l2)/2
        double area= (lunghezzaCateto1 * lunghezzaCateto2 );

        return area;
    }

    public  double calcolaPerimetro()
    {
        double perimetro =lunghezzaCateto2+lunghezzaCateto1+lunghezzaIpotenusa;
        return  perimetro;

    }



}
