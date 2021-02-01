package Assignment1;

public class TableTop{
    public static void main(String[] args){
        Table game1 = new Table(10,10);
        Miniature m1 = new Miniature("Wizard", "W");
        
        game1.printTable();
        
        game1.setPiece(4, 8, m1);

        pressAnyKeyToContinue();
        
        game1.movePiece(4, 8, 4, 7);
    }

    public static void pressAnyKeyToContinue()
    { 
           System.out.println("Press Enter key to continue...");
           try
           {
               System.in.read();
           }  
           catch(Exception e)
           {}  
    }
}