package TicTactToe;

public class Game {
    private Board board;
    private Player[] players;
    private int currentIndexOfPlayer;
    private GameStatus gameSatus;

    public Game(Player player1, Player player2,int size){
        this.board = new Board(size);
        this.players = new Player[]{player1,player2};
        this.gameSatus = GameStatus.INPROGRESS;
//        this.currentIndexOfPlayer=1;
    }

    public boolean playMove(int r,int c) throws Exception {
        if(gameSatus != GameStatus.INPROGRESS){
            throw new Exception("Game alredy finished");
        }

        if(!board.isValidMove(r,c)){
            throw new Exception("Invalid move");
        }

        Player currPlayer = players[currentIndexOfPlayer];

        board.makeMove(r,c,currPlayer.getSymbol());

        if(board.checkwin(currPlayer.getSymbol())){
            gameSatus = GameStatus.WIN;
            System.out.println(currPlayer.getName() + " WIN");
        }
        else if(board.isFull()){
            gameSatus = GameStatus.DRAW;
            System.out.println("Game draw");
        }
        else {
            currentIndexOfPlayer = (1-currentIndexOfPlayer);
        }

        return true;
    }

    public GameStatus getGameSatus(){
        return gameSatus;
    }

    public void printBoard(){
        board.print();
        System.out.println("--------------");
    }


}
