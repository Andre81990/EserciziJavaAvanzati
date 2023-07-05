package Astratte;

public class Audi extends Vehicle{


        public int numberOfDoors;
        private double price;


        //costruttore


    public Audi(int doors, int wheels,double price)
        {
            super();
            this.numberOfDoors=doors;
            this.price=price;

        }


        public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("L audi possiede "+numberOfDoors +" porte ");
    }


        public void VehicleSound() {
        System.out.println("l audi fa brum ");
    }
    }



