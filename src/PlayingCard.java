public class PlayingCard {
  private CardColors color;
  private CardValues value;
  private boolean visible = false;

  public PlayingCard(CardColors color, CardValues value) {
    this.color = color;
    this.value = value;
  }

  public void showCard() {
    System.out.println(color + " " + value);
  }

  public CardColors getColor() {
    return color;
  }

  public CardValues getValue() {
    return value;
  }

  public boolean isVisible() {
    return visible;
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }
}