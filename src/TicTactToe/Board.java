package TicTactToe;

public class Board {

    private Grid[][] grid;
    private int size;
    private int count;

    public Board(int size){
        this.size = size;
        grid = new Grid[this.size][this.size];
        count=0;
        initialiseBoard();
    }


    private void initialiseBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j] = new Grid();
            }
        }
    }

    public boolean isValidMove(int r,int c){
        if(r>=0 && c>=0 && r<=size && c<=size && grid[r][c].isEmpty()) return true;
        return false;
    }

    public void makeMove(int r,int c,Symbol symbol){
        grid[r][c].setSymbol(symbol);
    }

    public boolean checkwin(Symbol symbol){

        for(int i=0;i<size;i++){
            boolean flag=true;
            for(int j=0;j<size;j++){
                if(grid[i][j].getSymbol() != symbol){
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }

        for(int j=0;j<size;j++){
            boolean flag=true;
            for(int i=0;i<size;i++){
                if(grid[i][j].getSymbol() != symbol){
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }

        boolean diagonal1=true;
        for(int i=0;i<size;i++){
            if(grid[i][i].getSymbol() != symbol){
                diagonal1 = false;
            }
        }
        boolean diagonal2=true;
        for(int i=0;i<size;i++){
            if(grid[i][size-i-1].getSymbol() != symbol){
                diagonal2 = false;
            }
        }
        return diagonal1 || diagonal2;
    }

    public boolean isFull(){
        return count == size*size;
    }

    public void print(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(grid[i][j].getSymbol() + "|");
            }
            System.out.println();
        }
    }


}
