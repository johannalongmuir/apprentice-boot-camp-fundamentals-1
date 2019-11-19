package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements DeckMethods {

    private List<AnimalCard> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }


    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public CardMethods deal() {
        return cards.remove(0);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            AnimalCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }
}
