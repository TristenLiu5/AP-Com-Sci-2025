package cards;

public class Deck {

    public String[] Deck_Suit = {"♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️"};
    public String[] Deck_Value =  {"A","A", "A", "A", "2", "2", "2", "2" , "3", "3", "3", "3", "4", "4", "4", "4","5","5","5","5", "6", "6", "6", "6" , "7", "7", "7", "7", "8", "8", "8", "8","9","9","9","9", "10", "10", "10", "10" , "J", "J", "J", "J", "Q", "Q", "Q", "Q", "K", "K", "K", "K"};
    private int random;
    private int random2;

public void shuffle(){

    for (int i = 0; i <= Deck_Suit.length; i++)
    {
    random = ((int) (Math.random() * 52));
    random2 = ((int) (Math.random() * 52));
    String storage = (Integer.toString(random));

    storage = Deck_Suit[random];
    Deck_Suit[random] = Deck_Suit[random2];
    Deck_Suit[random2] = storage;

    storage = Deck_Value[random];
    Deck_Value[random] = Deck_Value[random2];
    Deck_Value[random2] = storage;
    }





}  



}
