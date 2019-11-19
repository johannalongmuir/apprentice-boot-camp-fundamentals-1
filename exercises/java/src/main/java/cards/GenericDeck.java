package cards;

import java.util.Collections;
import java.util.List;

public abstract class GenericDeck {

    // list of cards
    // Deal - abstractClass -
    // Abstract

    protected List<GenericCard> genericCardList;

    public List<GenericCard> getGenericCardList() {
        return genericCardList;
    }

    public void setGenericCardList(List<GenericCard> genericCardList) {
        this.genericCardList = genericCardList;
    }

    public void shuffle() {
        Collections.shuffle(genericCardList);
    }


    public GenericCard deal() {
        return genericCardList.remove(0);
    }

    public abstract String[] getCards();
}
