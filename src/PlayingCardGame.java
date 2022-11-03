import java.util.Scanner;

public class PlayingCardGame {
  static Scanner input = new Scanner(System.in);
  static PlayingCardDeck deck = new PlayingCardDeck();

  public static void main(String[] args) {
    displayGameRules();
    deck.shuffle();

    // Game loop
    String menuChoice = "";
    while (true) {
      do {
        displayMenu();
        menuChoice = chooseFromMenu();
      } while (menuChoice.equals("menu"));

      if (menuChoice.equals("quit")) break;

      playRound();
      // Press ENTER to continue
    }
  }

  public static String chooseFromMenu() {
    if (input.hasNextInt()) {
      int choice = input.nextInt();
      input.nextLine();
      switch (choice) {
        case 1:
          return "play";
        case 2:
          displayGameRules();
          break;
        case 3:
          System.out.println("\nThanks for playing!");
          return "quit";
      }
    }
    return "menu";
  }

  private static void playRound() {
    PlayingCard card1 = deck.deal();
    PlayingCard card2 = deck.deal();

    System.out.println("\nOpen card:");
    card2.showCard();

    String guess = getUserGuess();
    System.out.println("You guessed: " + guess);

    // Show hidden card
    System.out.println("\nYour card:");
    card1.showCard();

    String result = getResults(card1, card2, guess);
    displayResult(result);

    deck.addToBottom(card1);
    deck.addToBottom(card2);
  }

  private static String getUserGuess() {
    System.out.print("Take a guess: high or low (H/L)? ");
    String guess = "";
    while (!guess.equalsIgnoreCase("H") && !guess.equalsIgnoreCase("L")) {
      guess = input.nextLine();
    }
    return guess;
  }

  private static void displayResult(String result) {
    if (result.equals("win")) {
      System.out.println("You win!");
    } else {
      System.out.println("You lose!");
    }
  }

  private static String getResults(PlayingCard card1, PlayingCard card2,
                                   String guess) {
    if (card1.getValue().compareTo(card2.getValue()) > 0) {
      return guess.equalsIgnoreCase("H") ? "win" : "lose";
    } else if (card1.getValue().compareTo(card2.getValue()) < 0) {
      return guess.equalsIgnoreCase("L") ? "win" : "lose";
    } else {
      if (card1.getColor().compareTo(card2.getColor()) > 0) {
        return guess.equalsIgnoreCase("H") ? "win" : "lose";
      }
    }
    return "lose";
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