package piglatin;

import java.util.Scanner;


public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();


        // TO DO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }


    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        Scanner sc = new Scanner(input);
        while (sc.hasNext())
    {
        String word = input.next();
    }

        result = translateWord(input);

        return result;
    }


    public static boolean vowel(String letter)
    {
        if (letter.length() == 1)
        {
            String vowelBank = "aeiouy";
            if (vowelBank.indexOf(letter) != -1)
            {
                return true;
            }
        }
        return false;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";

        for (int i = 0; i < input.length(); i++)
        {
            String current = input.substring(i, i+1);
            if (vowel(current))
            {
                //if (isUpperCase(input.substring(0)) == false)
                //{
                    result = (input.substring(0,i) + input.substring(i) + "ay");
                //}
                break;
            }
        }
        
        

        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    //private int locate = 0;

}
