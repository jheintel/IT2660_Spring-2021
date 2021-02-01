package Assignment1;

class Table {
    int width;
    int height;
    Piece[][] pieceCheck;

    public void setGrid(int x, int y){
       width = x;
       height = y;

       pieceCheck = new Piece[width][height];
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setPiece(int x, int y, Piece p){
        if(x<width && y<height){
            pieceCheck[x-1][y-1] = p;
        }
        else{
            System.out.println("Cannot place there.");
        }
        printTable();
    }

    public void movePiece(int oldX, int oldY, int newX, int newY){
        if(newX<width && newY<height && (pieceCheck[newX-1][newY-1] == null) ){
            pieceCheck[newX-1][newY-1] = pieceCheck[oldX-1][oldY-1];
            pieceCheck[oldX-1][oldY-1] = null;
        }
        else{
            System.out.println("Cannot place there.");
        }
        printTable();
    }

    public void printTable(){
        clearScreen();
        printDivider();
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                if(pieceCheck[j][i] == null){
                    System.out.print("|   ");
                } else{
                    System.out.print("| " + pieceCheck[j][i].printPiece() + " ");
                }
            }
            System.out.println("|");
            printDivider();
        }
    }

    public void printDivider(){
        for(int j=0; j<width; j++){
            System.out.print("+---");
        }
        System.out.print("+");
        System.out.println();
    }

    public Table(int x, int y){
        setGrid(x, y);
    }

    //This code is strait stolen. I have little idea why that string does what it does.
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     
     }
    
}