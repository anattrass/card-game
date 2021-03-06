package game_management;

public class Card {

  private SuitType suit;
  private ValueType value;

  public Card(SuitType suit, ValueType value) {
    this.suit = suit;
    this.value = value;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public ValueType getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return value + " of " + suit; 
  }

}