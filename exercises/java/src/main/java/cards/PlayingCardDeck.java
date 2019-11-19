package cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements DeckMethods {
    private PlayingCard[] cards = new PlayingCard[52];

    public PlayingCardDeck() {
        for (Suit suit:Suit.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++)
                cards[suit.ordinal()*13+faceValue] = new PlayingCard(suit, faceValue);
        }
    }


    @Override
    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }

    @Override
    public CardMethods deal() {
        CardMethods cardToReturn = cards[0];
        cards = Arrays.copyOfRange(cards,1,cards.length);
        return cardToReturn;
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.length];
        int cardNumber = 0;
        for (PlayingCard card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }


//    public static void main(String[] args) {
//        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
//        String[] deckInOrder = cards.getCards();
//        for(String card: deckInOrder){
//
//            System.out.println(card);
//        }

}

