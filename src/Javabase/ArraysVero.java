package Javabase;

public class ArraysVero {

        public static void main(String[] args) {



        String[] cars = {"ferrari", "audi", "fiat", "lambo", "merced"};

        System.out.println("la lunghezza dell array è " + cars.length);

        //parte da zero e non da uno l indice
        System.out.println("il terzo elemento è " + cars[2]);

//vecchio array
        String[] carse = {"ferrari", "audi", "fiat", "lambo", "merced"};


        //nuovo array
        String[] copyDentro = new String[5];

//vecchio,
        System.arraycopy(carse, 0, copyDentro, 0, 5);

        for (String car : copyDentro) {
            {
                System.out.println(car + " è un elem della lista ");
            }

        }

        int[] primeNumbers;
        //={2,3,5,7,11,13};


        primeNumbers = new int[6];

        primeNumbers[0]=2;
        primeNumbers[1]=3;
        primeNumbers[2]=5;
        primeNumbers[3]=7;
        primeNumbers[4]=11;
        primeNumbers[5]=13;

        for (int i = 0; i<primeNumbers.length; i++)
        {
            System.out.println(primeNumbers[i]);
        }

    }
    }

