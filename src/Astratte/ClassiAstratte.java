package Astratte;

public class ClassiAstratte {
    public static void main(String[] args) {

        Audi au=new Audi(4,4,56000);
        Boat bo=new Boat(250,3400);

        au.VehicleSound();
        au.showVehicleDetails();


        bo.VehicleSound();
        bo.showVehicleDetails();

        bo.getBoatWeightAndSpeed();




    }

}



