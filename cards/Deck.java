package cards;

public class Deck {

    public String[] DeckSuit = {"♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️","♦️", "♥️" , "♣️", "♠️"};
    public String[] DeckValue =  {"A","A", "A", "A", "2", "2", "2", "2" , "3", "3", "3", "3", "4", "4", "4", "4","5","5","5","5", "6", "6", "6", "6" , "7", "7", "7", "7", "8", "8", "8", "8","9","9","9","9", "10", "10", "10", "10" , "J", "J", "J", "J", "Q", "Q", "Q", "Q", "K", "K", "K", "K"};
    private int random;
    private int random2;
    private String storage;
    private int drawNum;

public void shuffle(){

    for (int i = 0; i <= DeckSuit.length; i++)
    {
    random = ((int) (Math.random() * 52));
    random2 = ((int) (Math.random() * 52));
    storage = (Integer.toString(random));

    storage = DeckSuit[random];
    DeckSuit[random] = DeckSuit[random2];
    DeckSuit[random2] = storage;

    storage = DeckValue[random];
    DeckValue[random] = DeckValue[random2];
    DeckValue[random2] = storage;
    }
}

    public void cut(int deckCut){

        //30
            for (int j = 0; j < DeckSuit.length; j++)
            {
            storage = DeckSuit[j];
            DeckSuit[j] = DeckSuit[deckCut + j];
            DeckSuit[deckCut + j] = storage;

            storage = DeckValue[j];
            DeckValue[j] = DeckValue[deckCut + j];
            DeckValue[deckCut + j] = storage;
            
            }
            
            


        }


    

    public String draw(){

        if (drawNum < 51){
        return ("" + DeckSuit[drawNum] + "," + DeckSuit[drawNum] + "");
        }
        else
        {
            return null;
        }

    
    }
    





}  





