package pack;
public class King {
    public static void main(int row, int col) {

        

        // ROW SCAN CHECK
        if ((row > 8 || row < 1) || (col > 8 || col < 1)) {
            System.out.println("Illigel Input");
        } else {
                // ALL MOVES
                // vertical horizon
                if((row+1 <= 8 && row+1 >= 1) && (col+1 <= 8 && col+1 >= 1)){
                    System.out.format(" %d  %d\n", row + 1, col + 1);
                }

                if((row-1 <= 8 && row-1 >= 1) && (col-1 <= 8 && col-1 >= 1)){
                    System.out.format(" %d  %d\n", row - 1, col - 1);
                }

                if((row+1 <= 8 && row+1 >= 1) && (col-1 <= 8 && col-1 >= 1)){
                    System.out.format(" %d  %d\n", row + 1, col - 1);
                }

                if((row-1 <= 8 && row-1 >= 1) && (col+1 <= 8 && col+1 >= 1)){
                System.out.format(" %d  %d\n", row - 1, col + 1);
                }
               

                // DIAGNOLLY
                if(row+1 <= 8 && row+1 >= 1){
                    System.out.format(" %d  %d\n", row + 1, col);
                }

                if(row-1 <= 8 && row-1 >= 1){
                    System.out.format(" %d  %d\n", row - 1, col);
                }

                if(col+1 <= 8 && col+1 >= 1){   
                    System.out.format(" %d  %d\n", row, col + 1);
                }

                if(col-1 <= 8 && col-1 >= 1){
                    System.out.format(" %d  %d\n", row, col - 1);
                }
               
            }
               
    } // end of method main
} // end of class Knight
