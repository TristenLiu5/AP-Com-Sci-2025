package cards;

public class Hand {


    private String[] Current;

public Hand(int hand){


}

public void add(){

    
}

public int length(){

    return Current.length;
    
}

public String get(int a){

    if ((a > Current.length) || (a < 0))
    {
        return "";
    }
    else
    {
    return Current[a];
    }
    
}

public String remove(int a){

    if ((a > Current.length) || (a < 0))
    {
        return "";
    }
    else
    {
    return Current[a];
    //remove card
    }
    
}
}
