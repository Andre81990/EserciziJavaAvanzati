package Javabase.Javadoc;

/**
 * The type Tester.
 */
public class Tester {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        WordGames wg=new WordGames();
        System.out.println(wg.addHelloWord("mondo"));

        System.out.println(wg.getFullName("andrea","otto"));
    }


}
