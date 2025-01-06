package Controllers;

import javafx.event.ActionEvent;
import Utils.GameLogic;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class GameScene {

    @FXML

    public Button ButtonRock;
    public Button ButtonPaper;
    public Button ButtonScissor;
    public Text computerScore;
    public Text playerScore;
    public Text totalGamesPlayed;
    public int playerScoreValue;
    public int computerScoreValue;
    public int totalGamesPlayedValue;

    public GameScene() {
        computerScoreValue = 0;
        playerScoreValue = 0;
        totalGamesPlayedValue =0;
    }

    public void rock(ActionEvent actionEvent) {
        System.out.println("rock");
        int winner = GameLogic.getWinner(0);
        totalGamesPlayedValue++;
        String st = "";
        if(totalGamesPlayedValue <= 9) st = "0";
        totalGamesPlayed.setText(st + totalGamesPlayedValue);
        updateScore(winner);
    }

    public void paper(ActionEvent actionEvent) {
        System.out.println("paper");
        int winner = GameLogic.getWinner(0);
        totalGamesPlayedValue++;
        String st = "";
        if(totalGamesPlayedValue <= 9) st = "0";
        totalGamesPlayed.setText(st + totalGamesPlayedValue);
        updateScore(winner);
    }

    public void scissor(ActionEvent actionEvent) {
        System.out.println("scissor");
        int winner = GameLogic.getWinner(0);
        totalGamesPlayedValue++;
        String st = "";
        if(totalGamesPlayedValue <= 9) st = "0";
        totalGamesPlayed.setText(st + totalGamesPlayedValue);
        updateScore(winner);
    }

    private void updateScore(int winner) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Match Result");
        alert.setHeaderText(null);
        if(winner == 0) {
            alert.setContentText("It's a tie!");
        } else if(winner == 1) {
            alert.setContentText("Player wins!");
            playerScoreValue++;

            String st = "";
            if(playerScoreValue <= 9) st = "0";

            playerScore.setText(st + playerScoreValue);
        } else {
            alert.setContentText("Computer wins!");
            computerScoreValue++;

            String st = "";
            if(computerScoreValue <= 9) st = "0";
            computerScore.setText(st + computerScoreValue);
        }

        alert.showAndWait();
    }
}


