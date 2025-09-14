package TicTactToe;

public class Grid {

    private Symbol symbol;

    public Grid() {
        this.symbol = symbol.E;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isEmpty(){
        return symbol == Symbol.E;
    }
}
