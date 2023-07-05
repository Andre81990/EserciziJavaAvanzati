package Astratte;

public abstract class Vehicle
{
    private String type;
    private  int numberOfWheels;




    public  void showVehicleDetails()
    {
        System.out.println("questo veicolo è un "+type +" e possiede "+ numberOfWheels+" ruote " );

    }
    public abstract void VehicleSound();

}
