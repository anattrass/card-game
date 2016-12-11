package game_management;

public class Dealer extends Player {

    private Deck deck;

    public Dealer(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }

    public void dealCardToPlayer(Player receiver) {
        Card cardDealt = this.deck.dealCard();
        receiver.addCardToHand(cardDealt);
    }
}