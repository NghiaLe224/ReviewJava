package section15.collectionOverview.collectionMethod.games.poker;

import section15.collectionOverview.collectionMethod.Card;

import java.util.*;

public class PokerGame {
    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int random = new Random().nextInt(15, 35);
        Collections.rotate(deck, random);
        Card.printDeck(deck);

        deal();
        System.out.println("-".repeat(30));
        pokerHands.forEach(System.out::println);

        int cardsDealt = playerCount * cardsInHand;
        int cardsRemaining = deck.size() - cardsDealt;

        remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining, null)); //chứa 32 phâần tử null
        remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
        Card.printDeck(remainingCards, "Remaining Cards", 2);
    }

    private void deal(){
        Card[][] hands  = new Card[playerCount][cardsInHand];
        for(int deckIndex = 0, i = 0; i < cardsInHand; i++){
            for(int j = 0; j < playerCount; ++j){
                hands[j][i] = deck.get(deckIndex++);
            }
        }

        int playerNo = 1;
        for(Card[] hand : hands){
            pokerHands.add(new PokerHand(playerNo++, Arrays.asList(hand)));
        }
    }


}
