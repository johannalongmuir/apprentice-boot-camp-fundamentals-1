package cards;

public class Card {
    private int value;
    private int suit;

    Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    int getValue() {
        return value;
    }

    int getSuit() {
        return suit;
    }
}
