package pack;
public class Pawn {
    public static void main(int row, int col) {
      
        // ROW SCAN CHECK
        if ((row > 8 || row < 1) || (col > 8 || col < 1)) {
            System.out.println("Illigel Input");
           

        } else if(row == 8 || row == 1){
            // type change from pawn to ROOK QUEEN BISHOP KNIGHT
            System.out.println("type change from pawn to ROOK QUEEN BISHOP KNIGHT");
        } else {

            System.out.println("This program reads two integers which " +
                "represent the pawn's location on the chess board: ");

                // VARIBLES FOR GENARTING MOVES OPTIONS | P => PLUS, M => MINUS
                int row_p1 = row + 1;
                int row_p2 = row + 2;


                // ALL MOVES
                System.out.println("Moves: ");
                if (row_p1 > 0 && row_p1 < 9) {
                    System.out.format("%d %d \n", row_p1,col);
                }

                if (row_p2 > 0 && row_p2 < 9 && row == 2) {
                    System.out.format("%d %d \n", row_p2,col);
                }
                
            }

    } // end of method main
} // end of class Knight
