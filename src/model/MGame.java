package model;

public class MGame {
    private static final int N = 10;

    private int roundCnt;
    private Die[] dice;
    private Player[] players;
    private Board board;

    public void playGame() {
        while (roundCnt < N) {
            playRound();
            ++roundCnt;
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }

}
