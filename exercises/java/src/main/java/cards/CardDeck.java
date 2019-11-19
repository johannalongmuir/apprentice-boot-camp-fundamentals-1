package cards;

public class CardDeck implements DeckMethods {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        String[] deckInOrder = cardDeck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }


    @Override
    public void shuffle() {

    }

    @Override
    public AnimalCard deal() {
        return null;
    }

    public String[] getCards() {
        String[] result = new String[52];
        Card[] deck = new Card[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Card cardNew = new Card(suit, faceValue);
                deck [suit*13+faceValue] = cardNew;
            }
        }

        int cardNumber = 0;

        for (Card card : deck) {
            //refactor this. Add map if key == 0, get value

            String faceValueName;
            switch (card.getValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.getValue() + 1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card + "is not a valid faceValue!");
            }


            String suitName;
            switch (card.getSuit()){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card + "is not a valid suitName!");
            }


            result[cardNumber] = faceValueName + " of " + suitName;

            cardNumber++;
        }

        return result;
    }
}
