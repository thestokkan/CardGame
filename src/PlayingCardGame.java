import java.util.Scanner;

public class PlayingCardGame {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    displayGameRules();

    PlayingCardDeck deck = new PlayingCardDeck();
    deck.shuffle();

    displayMenu();

  }

  private static void displayGameRules() {
    System.out.println("\n=== GAME RULES ===");
    System.out.println("The game goes as follows:");
    System.out.println("Each round, two cards are drawn from the top of the " +
                       "deck.");
    System.out.println("One card is yours, the other is open.");
    System.out.println("Make a guess about whether your card is higher or " +
                       "lower than the open card.");
    System.out.println("If you guess correctly, you win, if your guess is " +
                       "wrong, " +
                       "you lose.");
    System.out.println("If the cards have the same value, the colors are " +
                       "compared.");
    System.out.println("\nCard precedence:");
    System.out.println("Values: Ace > King > Queen > Jack > numbered" +
                       " cards in order");
    System.out.println("Colors: SPADES (♠) > HEARTS (♥) > DIAMONDS (♦) > " +
                       "CLUBS (♣).");
  }

  private static void displayMenu() {
    System.out.println("\n=== MENU ===");
    System.out.println("1. Play game");
    System.out.println("2. Display game rules");
    System.out.println("3. Quit");
  }

  private static void playGame() {
    // Deal cards
    // Update deck
  }

  private static void decideWinner() {

  }

}