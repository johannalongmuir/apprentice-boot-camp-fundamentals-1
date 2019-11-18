package cards;

import java.util.Scanner;

class Snap {
    private int player1Score;
    private int player2Score;

    // TODO Generic Deck deck
    private AnimalDeck deck;


    // TODO GenericDeck deck
    Snap(AnimalDeck deck) {
        this.deck = deck;
        deck.shuffle();
    }




    public static void main(String[] args) {
        //TODO Generic Deck deck = new Animal or General deck
        //TODO change below to Generic Deck
        Snap snap = new Snap(new AnimalDeck());
        snap.play();
    }




    void play() {
        Scanner scanner = new Scanner(System.in);

        // TODO Generic Card
        AnimalCard previousCard = null;
        while (deck.getCards().length > 0) {

            // TODO Generic Card
            AnimalCard currentCard = deck.deal();



            System.out.println(currentCard);
            String input = scanner.nextLine();
            if (input.length() > 0 && input.charAt(0) == 'a') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! score Player 1");
                    player1Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 1");
                    player1Score--;
                }
            } else if (input.length() > 0 && input.charAt(0) == 'l') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! scorePlayer 2");
                    player2Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 2");
                    player2Score--;
                }
            }
            previousCard = currentCard;
        }

        if (player1Score == player2Score) {
            System.out.println("Draw.");
        } else if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else System.out.println("Player 2 wins!");

        System.out.println("Scores: " + player1Score + " vs " + player2Score);
    }
}
