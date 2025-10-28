package piglatin;

import java.io.*;
import java.net.*;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private ArrayList<String> text = new ArrayList<String>();

    Book() {
        // Empty book - no code needed here.
    }

    // Helper to debug code
    // Prints out a range of lines from a book
    public void printlines(int start, int length) {
        System.out.println("Lines " + start + " to " + (start + length) + " of book: " + title);
        for (int i = start; i < start + length; i++) {
            if (i < text.size()) {
                System.out.println(i + ": " + text.get(i));
            } else {
                System.out.println(i + ": line not in book.");
            }
        }
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getLine(int lineNumber) {
        return text.get(lineNumber);
    }

    int getLineCount() {
        return text.size();
    }

    void appendLine(String line) {
        text.add(line);
    }

    public void readFromString(String title, String string) {

        Scanner sc = new Scanner(string);
        {
            while (sc.hasNextLine());
            {
                text.add(sc.nextLine());
            }
        }
        sc.close();
        // load a book from an input string.
        this.title = title;

        // TO DO: use Scanner to populate the book
        // use: text.add(line) to add a line to the book.
    }

    public void readFromUrl(String title, String url) {
        // load a book from a URL.
        // https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
        this.title = title;

        try {
            URL bookUrl = URI.create(url).toURL();
            // TO DO: use Scanner to populate the book
            // Scanner can open a file on a URL like this:
            // Scanner(bookUrl.openStream())
            // use: text.add(line) to add a line to the book.
            Scanner input = new Scanner(bookUrl.openStream());
            while (input.hasNextLine());
            {
                input.nextLine();
            }
            input.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void writeToFile(String name) {
        // TO DO: Add code here to write the contents of the book to a file.
        // Must write to file using provided name.

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(title + ".txt",  true)))
        {
            for (int i = 0; i <= getLineCount(); i++)
            {
                writer.write(text.get(i));
                writer.newLine();
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
