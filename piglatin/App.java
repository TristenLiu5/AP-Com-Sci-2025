package piglatin;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        /*  Introduction and TO DO List

        This project is setup with four main classes:
            1. App - the main application
            2. Book - a class that creates the basic book objects.
                - a Book contains a representation of a real book.
                - Book has methods to read data in from various sources
                - Book also has methods to read data out.
            3. PigLatinTranslator - a static class
                - Used to implement your translator.
                - Has two public methods to take input and return a translated copy.
                    - Book translate(Book input)
                    - String translate(String input)
            4. TestSuite - a simple class that helps you test your work.
                - Just like CodingBat this class tries your code against various cases.
                - It will tell you which cases return expected output or not
         */


        // Run tests, comment out once they pass.
        int score = TestSuite.run();
        System.err.println("finsihed test");
        // Focus on TestSuite until you get a score of 5 or higher.
        if (score > 4)
        {
            // Starter book
            Book input = new Book();

            // Start with a "test" book based on a string.
            // Get this to work, and all the tests to pass first.
            //input.readFromString("TestBook", "Dog\nCat\nMouse");
            System.err.println("reading url");
            // Example reading from a URL
            System.err.println("www.gutenberg.org/cache/epub/1513/pg1513.txt");
            //


try {
            URL bookUrl = URI.create("https://www.gutenberg.org/cache/epub/1513/pg1513.txt").toURL();
            // TO DO: use Scanner to populate the book
            // Scanner can open a file on a URL like this:
            // Scanner(bookUrl.openStream())
            // use: text.add(line) to add a line to the book.
            Scanner sc = new Scanner(bookUrl.openStream());
            while (sc.hasNextLine());
            {   
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }







            //
            input.readFromUrl("Romeo and Juliet", "https://www.gutenberg.org/cache/epub/1513/pg1513.txt");
            System.err.println("finsihed reading");
            
            input.printlines(0,2);
            Book output = PigLatinTranslator.translate(input);
            output.printlines(0,2);
            output.writeToFile("example.txt");
        }
    }
}

