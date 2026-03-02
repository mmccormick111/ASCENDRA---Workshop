import java.io.*;
import java.util.*;

public class TermLoader {
    public static void loadFile(String filename, Category category, Terms terms) {

        try (Scanner scanner = new Scanner(new File(filename))) {

            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim().toLowerCase();

                if (!word.isEmpty()) {
                    Term term = new Term(word, category);
                    terms.addTerm(term);
                }
            }
        scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot find file " + filename);
        }


    }
}
