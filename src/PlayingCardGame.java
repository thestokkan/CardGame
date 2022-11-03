import java.util.Scanner;

public class PlayingCardGame {
  static Scanner input = new Scanner(System.in);
  static PlayingCardDeck deck = new PlayingCardDeck();

  public static void main(String[] args) {
    displayGameRules();
    deck.shuffle();
    String choice;

    do {
      displayMenu();
      choice = chooseFromMenu();
    } while (choice.equals("menu"));

    // Game loop
    while (choice.equals("play")) {
      playRound();

      // Press ENTER to continue

      do {
        displayMenu();
        choice = chooseFromMenu();
      } while (choice.equals("menu"));
    }
  }

  public static String chooseFromMenu() {
    if (input.hasNextInt()) {
      int choice = input.nextInt();
      input.nextLine();
      switch (choice) {
          case 1 : return "play";
          case 2 :
            displayGameRules();
            break;
          case 3 : return "quit";
        }
    }
    return "menu";
  }

  private static void playRound() {
    PlayingCard card1 = deck.deal();
    PlayingCard card2 = deck.deal();

    System.out.println("\nOpen card:");
    card2.showCard();

    // User makes guess
    System.out.print("High or low? ");

    // Show hidden card
    System.out.println("\nYour card:");
    card1.showCard();

    // Decide if win or lose
    // Display results
    System.out.println("\nResults: ");

    deck.addToBottom(card1);
    deck.addToBottom(card2);
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
    System.out.print("\nYour choice: ");
  }

}