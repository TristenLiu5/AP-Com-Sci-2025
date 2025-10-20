package piglatin;

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

        // TO DO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        result = translateWord(input);

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";


        if ((input.indexOf("a")) == (0) || (input.indexOf("e")) == (0) || (input.indexOf("i")) == (0) || (input.indexOf("o")) == (0) || (input.indexOf("u")) == (0) || (input.indexOf("y")) == (0) || (input.indexOf("A")) == (0) || (input.indexOf("E")) == (0) || (input.indexOf("I")) == (0) || (input.indexOf("O")) == (0) || (input.indexOf("U")) == (0) || (input.indexOf("Y")) == (0)) 
        {
            result = (input + "ay");
        }
        else if ((input.indexOf("a") > 0) && ((input.indexOf("e")) > (input.indexOf("a")) || (input.indexOf("e")) == -1) && ((input.indexOf("i")) > (input.indexOf("a")) || (input.indexOf("i")) == -1) && ((input.indexOf("o")) > (input.indexOf("a")) || (input.indexOf("o")) == -1) && ((input.indexOf("u")) > (input.indexOf("a")) || (input.indexOf("u")) == -1) && ((input.indexOf("y")) > (input.indexOf("a")) || (input.indexOf("y")) == -1))
        {
            int index = input.indexOf("a");

            result = (input.substring(index) + input.substring(0,index) + "ay");
        }
        else if ((input.indexOf("e") > 0) && ((input.indexOf("e")) > (input.indexOf("a")) || (input.indexOf("a")) == -1) && ((input.indexOf("e")) > (input.indexOf("i")) || (input.indexOf("i")) == -1) && ((input.indexOf("e")) > (input.indexOf("o")) || (input.indexOf("o")) == -1) && ((input.indexOf("e")) > (input.indexOf("u")) || (input.indexOf("u")) == -1) && ((input.indexOf("e")) > (input.indexOf("y")) || (input.indexOf("y")) == -1))
        {
            int index = input.indexOf("a");

            result = (input.substring(index) + input.substring(0,index) + "ay");
        }
        

        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    //private int locate = 0;

}
