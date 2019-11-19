package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperDeck implements Deck {
    private List<Card> cards;

    public SuperDeck() {
        cards = new ArrayList<>();
        AnimalDeck animalDeck = new AnimalDeck();
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();

        while (playingCardDeck.getCards().length > 0) {
            Card deal = playingCardDeck.deal();
            cards.add(deal);
            cards.add(deal);
        }

        while (animalDeck.getCards().length > 0) {
            animalDeck.deal();
            cards.add(animalDeck.deal());
        }

    }


    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }
}
