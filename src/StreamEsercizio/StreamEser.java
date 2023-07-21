package StreamEsercizio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class StreamEser


{

        public static void main(String[] args) {
            try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Andrea\\Desktop\\testo.txt"))) {

                lines.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

