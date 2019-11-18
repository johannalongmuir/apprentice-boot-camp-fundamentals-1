package cards;

public class BuildDeck {

    // refactor this
    private static Card[] buildDeck() {
            Card[] deck = new Card[52];
            for (int suit = 0; suit < 4; suit++) {
                for (int faceValue = 0; faceValue < 13; faceValue++) {
                    Card cardNew = new Card(suit, faceValue);
                    deck[suit * 13 + faceValue] = cardNew;
                }
            }
            return deck;
    }



}
