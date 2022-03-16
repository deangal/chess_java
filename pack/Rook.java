package pack;
public class Rook {
    public static void main(int row, int col) {

        

        // ROW SCAN CHECK
        if ((row > 8 || row < 1) || (col > 8 || col < 1)) {
            System.out.println("Illigel Input");
        } else {
            // ALL MOVES
            for(int i = 1; i < 9; i ++){
                if(i != row){
                    System.out.format(" %d  %d\n", i, col);
                }
                if(i != col){
                    System.out.format(" %d  %d\n", row, i);
                }
            }
               
        }
    } // end of method main
} // end of class Knight
