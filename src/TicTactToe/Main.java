package TicTactToe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Player player1 = new Player("Player1", Symbol.X);
        Player player2 = new Player("Player2", Symbol.O);

        Game game = new Game(player1, player2, 3);

        game.playMove(0,0);
        game.printBoard();

        game.playMove(0,1);
        game.printBoard();

        game.playMove(2,2);
        game.printBoard();

        game.playMove(0,2);
        game.printBoard();

        game.playMove(1,1);
        game.printBoard();

    }
}