package StreamEsercizio;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
*
*Crea un nuovo progetto Java, all'interno
* della srccartella definisci un file chiamato file.txt
* che ha le seguenti righe:
hello
how
are you
?
crea una classe tester che utilizza l' API Stream per
provare a leggere ogni riga di file.txt
cogliere un potenziale IOException
*
* */
public class TesterClass

{
    public static void main(String[] args) throws IOException {


        List<String> file = Arrays.asList("hello");
        List<String> filtered = file.stream().filter(s -> s.length() == 5).collect(Collectors.toList());

        List<String> file2 = Arrays.asList("how");
        List<String> filtered2 = file2.stream().filter(s -> s.length() == 3).collect(Collectors.toList());

        List<String> file3 = Arrays.asList("are");
        List<String> filtered3 = file3.stream().filter(s -> s.length() == 3).collect(Collectors.toList());


        List<String> file4 = Arrays.asList("you");
        List<String> filtered4 = file4.stream().filter(s -> s.length() == 3).collect(Collectors.toList());

        List<String> file5 = Arrays.asList("?");
        List<String> filtered5 = file5.stream().filter(s -> s.length() == 1).collect(Collectors.toList());


        System.out.println(filtered);
        System.out.println(filtered2);
        System.out.println(filtered3);
        System.out.println(filtered4);
        System.out.println(filtered5);




    }
}
