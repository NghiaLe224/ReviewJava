package section15.collectionOverview.collectionMethod.games;

import section15.collectionOverview.collectionMethod.games.poker.PokerGame;

public class GameController {
    public static void main(String[] args) {
        PokerGame fiveCardDraw = new PokerGame(4, 5);
        fiveCardDraw.startPlay();

    }
}
