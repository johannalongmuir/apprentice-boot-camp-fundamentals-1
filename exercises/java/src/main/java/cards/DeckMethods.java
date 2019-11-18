package cards;

import java.util.Collections;

public interface DeckMethods {

    // snap



    // shuffle
    void shuffle();

//    void shuffle() {
//        Collections.shuffle(cards);
//    }



    // deal
    AnimalCard deal();

//    AnimalCard deal() {
//        return cards.remove(0);
//    }



    // get cards
    String[] getCards();


    // play


}
