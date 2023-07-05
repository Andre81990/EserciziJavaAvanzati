package Ereditarietà;

public class Shape {





    private String shapeName;

    private int numberOfEdges;

    //overload stessa signature ma diversi parametri si arriva al polimorfismo
    //0 indefinita
    public Shape() {
        System.out.println("user l oggetto è stato creato con successo ");
        this.shapeName="undefinedShape";
    }



    //1 cerchio
    public Shape(double radius) {

        System.out.println("è stato creato un cerchio");
        this.shapeName = "cerchio";
        this.numberOfEdges = 0;
    }


    //2 quadrato
    public Shape(int edges,double edgeLenght) {

        System.out.println("è stato creato un quadrato");
        this.numberOfEdges=edges;
        this.shapeName=" quadrato";

    }

    //3 rettangolo
    public Shape(int edges,double e1,double e2)
    {
        System.out.println("creato un rettangolo");
        this.shapeName="rettangolo ";
        this.numberOfEdges=edges;
    }
// 4 triangolo


    public Shape(int edges,double e1,double e2,double e3)
    {
        System.out.println("creato un triangolo");
        this.shapeName="triangolo ";
        this.numberOfEdges=edges;
    }


    public String getShapeDetails()
    {

        return "La figura è un "+ shapeName +" e  ha  "+ numberOfEdges+" margini/edge ";

    }

    public static void main(String[] args) {
//undefinde
        Shape s=new Shape();
//cerchio
        Shape s1=new Shape(1.4);
        //quadrato
        Shape s2=new Shape(4 ,4.56 );
        //rettangolo
        Shape s3=new Shape(4,4.5,34.5);
        //triangolo
        Shape s4=new Shape(3,4.4,34.5,4.6);



        String zero=s.getShapeDetails();
        System.out.println(zero.toString());


        String primo=s1.getShapeDetails();
        System.out.println(primo.toString());


        String secondo=s2.getShapeDetails();
        System.out.println(secondo.toString());

        String terzo=s3.getShapeDetails();
        System.out.println(terzo.toString());

        String quarto=s4.getShapeDetails();
        System.out.println(quarto.toString());





    }


}
