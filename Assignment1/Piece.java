package Assignment1;

abstract class Piece{
    String symbol;

    abstract public void setSymbol(String s);
    abstract public String getSymbol();
    abstract public String printPiece();
    abstract public void setDescription(String s);
    abstract public void giveDescription();
}
