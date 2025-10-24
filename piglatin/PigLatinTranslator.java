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
            String vowelBank = "aeiouyAEIOUY";
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
        String closer = "";

        for (int i = 0; i < input.length(); i++)
        {
            String current = input.substring(i, i+1);
            if (vowel(current)) 
            {
                String upperInput = input.substring(0,1).toUpperCase();
                if ((input.substring(input.length()-1).equals(".")) || input.substring(input.length()-1).equals(",") || input.substring(input.length()-1).equals("?") || input.substring(input.length()-1).equals("!"))
                {
                    if (upperInput.equals(input.substring(0,1)))
                    {
                        if (input.substring(input.length()-1).equals(".")) 
                        {
                            closer = ".";
                        }
                        else if (input.substring(input.length()-1).equals(","))
                        {
                            closer = ",";
                        }
                        else if (input.substring(input.length()-1).equals("?"))
                        {
                            closer = "?";
                        }
                        else if (input.substring(input.length()-1).equals("!"))
                        {
                            closer = "!";
                        }
                        result = (input.substring(i, input.length()-1) + input.substring(0,i) + "ay" + closer);
                        result = (result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase());
                                                
                    }
                    else
                    {
                        if (input.substring(input.length()-1).equals(".")) 
                        {
                            closer = ".";
                        }
                        else if (input.substring(input.length()-1).equals(","))
                        {
                            closer = ",";
                        }
                        else if (input.substring(input.length()-1).equals("?"))
                        {
                            closer = "?";
                        }
                        else if (input.substring(input.length()-1).equals("!"))
                        {
                            closer = "!";
                        }

                        result = (input.substring(i) + input.substring(0,i) + "ay" + closer);
                    }
                }
                else
                {
                    if (upperInput.equals(input.substring(0,1)))
                    {
                        result = (input.substring(i) + input.substring(0,i) + "ay");
                        result = (result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase());
                        
                    }
                    else
                    {
                        result = (input.substring(i) + input.substring(0,i) + "ay");
                    }
                }
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
