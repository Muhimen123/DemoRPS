package Utils;

import java.util.Random;

public class GameLogic {

    static int[][] winnerArray = {
            {0, 1, 2},
            {2, 0, 1},
            {1, 2, 0}
    };

    private static int generateRandom() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static int getWinner(int playerMove) {
        int computerMove = generateRandom();
        return winnerArray[playerMove][computerMove];
    }

}