package javaOopAdvanced.AdvancedIDEfeaturesDebugger;

import org.junit.jupiter.api.Assertions;



//Funzionalità IDE avanzate, Debugger
/*
* mentre scavalcare ti permette di saltare il metodo e passare alla riga successiv
*debugger forniscono spesso una finestra di controllo delle variabili o un analizzatore di espressioni,
* Un'altra caratteristica utile dei debugger è la capacità di modificare i valori delle variabili durante il runtime
*
*
*  debugger offrono la possibilità di rilevare e gestire le eccezioni.
*
* */



public class Exercises {
    public static void main(String[] args) {




     exercise1();
     //  exercise2();
        //exercise3();
    }

    /**
     * 1:
     *
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     *
     * Find and fix the error using the debugger
     *
     *
     *
     *
       Il seguente codice dovrebbe fare un fattoriale del numero cinque, che assomiglia a questo: 5*4*3*2*1 = 120
     *
     * Trova e correggi l'errore usando il debugger
     *
     */
    private static void exercise1()  {

        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = 0;
        try {
            factorial = calculateFactorial(number);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(120, factorial);



    }
    private static int calculateFactorial(int number) throws Exception,NullPointerException {


        //Fix this code
        //
        //1 × 2 × 3 × 4 × 5=120
        int result = 1;

        for (int i = number; i >= 1; i -= 2) {//i=5  ;5 >=1; 3
            result = result * i;
        }
        return result;
    }

    /**
     * 2:
     *
     * The following code is supposed to reverse a string
     *
     * Find and fix the error using the debugger
     *
     *
     * * Il codice seguente dovrebbe invertire una stringa
     *      *
     *      * Trova e correggi l'errore usando il debugger
     *      *
     *      */

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);
    }

    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length() - 1; i >= 1; i--) {
            reversed += reversed + input.charAt(i);
        }
        return reversed;
    }

    /**
     * 3:
     *
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     *
     * Find and fix the error using the debugger
     *
     *
     *
     * Il seguente codice dovrebbe controllare se un numero è positivo o negativo
     * ma c'è un errore semantico nell'istruzione if.
     *
     * Trova e correggi l'errore usando il debugger
     *
     *
     *
     */
    private static void exercise3() {




        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5)); //false
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertFalse(isPositive(0));
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));//true
        Assertions.assertTrue(isPositive(4567));
    }


    private static boolean isPositive(int num) {
        //Fix this code
        return num >= 0;
    }
}
