package pack;
public class Queen {
    public static void main(int row, int col) {

        // ROW SCAN CHECK
        if ((row > 8 || row < 1) || (col > 8 || col < 1)) {
            System.out.println("Illigel Input");
        } else {
            
            // ALL MOVES
            for(int i = 1; i < 9; i++){

                // vertical horizon
                if(i != row){
                    System.out.format(" %d  %d\n", i, col);
                }
                if(i != col){
                    System.out.format(" %d  %d\n", row, i);
                }

                // diagnolly
                // row+1, col+1
                if((row+i <= 8 && row+i >= 1) && (col+i <= 8 && col+i >= 1)){
                    System.out.format(" %d  %d\n", row+i, col+i);
                }

                // row-1, col-1
                if((row-i <= 8 && row-i >= 1) && (col-i <= 8 && col-i >= 1)){
                    System.out.format(" %d  %d\n", row-i, col-i);
                }

                // row-1, col+1
                if((row-i <= 8 && row-i >= 1) && (col+i <= 8 && col+i >= 1)){
                    System.out.format(" %d  %d\n", row-i, col+i);
                }

                // row+1, col-1
                if((row+i <= 8 && row+i >= 1) && (col-i <= 8 && col-i >= 1)){
                    System.out.format(" %d  %d\n", row+i, col-i);
                }
            }
               
        }
    } // end of method main
} // end of class Knight
