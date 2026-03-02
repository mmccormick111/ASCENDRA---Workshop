import java.util.*;
import java.io.*;
// Create a program that takes a text file as data, and outputs a score based on how vulgar the language is.
 public class TweetAnalyzer {
     public static void main(String[] args){

         Terms terms = new Terms();

         TermLoader.loadFile("offensive_terms.txt", Category.TOXIC_GENERAL, terms);
         TermLoader.loadFile("hatefulTerms.txt", Category.TOXIC_HATE, terms);
         TermLoader.loadFile("sexualTerms.txt", Category.TOXIC_SEXUAL, terms);
         TermLoader.loadFile("racistTerms.txt", Category.TOXIC_RACIST, terms);

         int userHabitScore = analyzeText("tweets.txt", terms);

         System.out.println("Your Habit Score: " + userHabitScore);
     }

     public static int analyzeText(String fileName, Terms terms){
         int habitScore = 0;

         try {
             Scanner scanner = new Scanner(new File(fileName));

             while (scanner.hasNextLine()) {
                 String line = scanner.nextLine().toLowerCase();

                 String[] words = line.split("\\W+");

                 for (String word: words){
                     Term term = terms.getTerm(word);

                     if (term != null) {
                         habitScore += term.getSeverity();
                     }
                 }
             }
             scanner.close();
         } catch (FileNotFoundException e) {
             System.out.println("Error: Cannot find file " + fileName);
         }

         return habitScore;
     }
}