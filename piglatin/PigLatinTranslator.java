package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();


        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        result = translateWord(input);

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";

        if ((input.indexOf("a")) == (0) || (input.indexOf("e")) == (0) || (input.indexOf("i")) == (0) || (input.indexOf("o")) == (0) || (input.indexOf("u")) == (0) || (input.indexOf("y")) == (0)) 
        {
            result = (input + "ay");
        }

        while (locate > (input.indexOf("a")))
        {
        if ((input.indexOf("a")) == (0) || (input.indexOf("e")) == (0) || (input.indexOf("i")) == (0) || (input.indexOf("o")) == (0) || (input.indexOf("u")) == (0) || (input.indexOf("y")) == (0)) 
        {
            result = (input.substring(1) + input.substring(0,1) + "ay");
        }
        }
        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    private int locate = 0;

}
