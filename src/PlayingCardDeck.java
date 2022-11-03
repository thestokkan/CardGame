import java.util.LinkedList;

public class PlayingCardDeck {
  LinkedList<PlayingCard> deck = new LinkedList<>();
  private int size;

  public void shuffle() {
    for (CardColors color : CardColors.values()) {
      for (CardValues value : CardValues.values()) {
        deck.add(new PlayingCard(color, value));
      }
    }
    System.out.println("Cards added");
  }

  public void printDeck() {
    for (PlayingCard card: deck) {
      System.out.println(card.getColor() + " " + card.getValue());
    }
  }

  public PlayingCard deal() {
    try {
      return deck.remove();
    } catch (Exception e) {
      System.out.println("No more cards!");
    }
    return null;
  }

  public void addToBottom(PlayingCard card) {
    deck.add(card);
  }

  public int getSize() {
    return deck.size();
  }
}