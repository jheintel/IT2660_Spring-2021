package Assignment1;

class Miniature extends Piece implements Nameable{
    String name;
    String description;

    public String getName() {
        return name;
    } 
    public void setName(String n){
        name = n;
    }

    public void setDescription(String s){
        description = s;
    }
    public void giveDescription(){
        System.out.println(description);
    }

    public void setSymbol(String s){
        symbol = s;
    }
    public String getSymbol(){
        return symbol;
    }

    public String printPiece(){
        return symbol;
    }

    public Miniature(String n, String s){
        setName(n);
        setSymbol(s);
    }
}