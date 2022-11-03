
public class PlayingCardGame {
  public static void main(String[] args) {

    PlayingCardDeck deck = new PlayingCardDeck();
    System.out.println(deck.getClass());

    deck.shuffle();
    System.out.println("=== Initial deck ===");
    System.out.println(deck.getSize());
    deck.printDeck();

    System.out.println("=== Dealt cards ===");
    PlayingCard card1 = deck.deal();
    PlayingCard card2 = deck.deal();
    card1.showCard();
    card2.showCard();

    System.out.println("=== Remaining cards ===");
    deck.printDeck();
    System.out.println(deck.getSize());

  }
}