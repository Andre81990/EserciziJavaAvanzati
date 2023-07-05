package Astratte;

public class Boat extends Vehicle{


    public double maxKnotsSpeed;

    public int boatKilosWeight;


    public void VehicleSound() {
        System.out.println("la barca fa shhhhh");
    }

    public Boat(double maxKnotsSpeed,int boatKilosWeight) {
        super();
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight=boatKilosWeight;
    }


    public void getBoatWeightAndSpeed()
    {
        System.out.println("La boat ha un peso totale di " +boatKilosWeight +" " +
                "e raggiunge una velocita massima di "+ maxKnotsSpeed +"km/h" );

    }

}
