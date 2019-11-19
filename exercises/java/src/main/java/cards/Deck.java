package cards;

public interface Deck {

    void shuffle();

    Card deal();

    String[] getCards();



}
