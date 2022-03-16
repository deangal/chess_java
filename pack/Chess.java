package pack;
// UNFORTUNETLY WE CANT USE CLASSES IN THIS ASSIGNMENT SO THE CODE IS LESS CLEAN THAN I WANTED IT TO BE 
import java.util.Scanner;
import pack.Knight;
public class Chess {
    public static void main(String[] args) {
        // SCAN 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type" +
                " of the first chessman");

        char first = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row1 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col1 = scan.nextInt();
        System.out.println("Please enter the type" +
                " of the second chessman");

        char second = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row2 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col2 = scan.nextInt();

        // CONST VARIBALES
        // IS THREAT VARIBALE FOR OUTPUT
        boolean isThreat = false;

        // ALL POSSIBLE KNIGHT EXACT MOVES VARIBALES
        int row_p1 = row1 + 1;
        int row_m1 = row1 - 1;
        int row_p2 = row1 + 2;
        int row_m2 = row1 - 2;

        int col_p1 = col1 + 1;
        int col_m1 = col1 - 1;
        int col_p2 = col1 + 2;
        int col_m2 = col1 - 2;

        // CHECKING DIFFRENCE FOR BISHOP MOVES VARIBALES
        int row_diff = row2 - row1;
        int col_diff = col2 - col1;


        // SCAN CHECK 
        // TO AVOID NESTING THE CHECKS IS TAKING PLACE AFTER ALL OF THE SCANS TOOK PLACE:
        // שימו לב, הבדיקות יתבצעו לאחר קריאת כל הקלט.
        if (first == second) {
            System.out.println("Chessmen should be different from each other");
        } else if (row1 < 0 || row1 > 8 || row2 < 0 || row2 > 8 || col1 < 0 || col1 > 8 || col2 < 0 || col2 > 8) {
            System.out.println("Position is not legal");
        } else

        if (row1 == row2 && col1 == col2) {
            System.out.println("Chessmen positions should not be identical");
        } else {

        boolean isSeconed = false;    
            //FIRST THREAT CHECK
            if(!isSeconed){
            // ROOK
            if (first == 'r') {
                // IF COL OR ROW ARE THE SAME ,ROOK MOVED HORIZONTALLY OR VERTICALLY
                if (row1 == row2 || col1 == col2) {
                    isThreat = true;
                } 
            }

            // KNIGHT
            if (first == 'k') {

                // ALL POSSIBLE KNIGHT EXACT MOVES
                // row+1 , col+-2
                if ((row_p1 > 0 && row_p1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_p1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p1 > 0 && row_p1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_p1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row-1 , col+-2
                if ((row_m1 > 0 && row_m1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_m1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m1 > 0 && row_m1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_m1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row+2 , col+-1
                if ((row_p2 > 0 && row_p2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_p2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p2 > 0 && row_p2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_p2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }

                // row-2 , col+-1
                if ((row_m2 > 0 && row_m2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_m2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m2 > 0 && row_m2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_m2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }
            }

            // BISHOP
            if (first == 'b') {
                
                // MAKING THEM BOTH POSITIVE TO COMPARE THEM
                if (row_diff < 0) {
                    row_diff = -row_diff;
                }
                if (col_diff < 0) {
                    col_diff = -col_diff;
                }

                // IF BOTH DIFFRENCES ARE THE SAME, BISHOP MOVED DIAGONLLY
                if (row_diff == col_diff) {
                    isThreat = true;
                } 

            }

            // OUTPUT PRINT
            if (isThreat) {
                System.out.format("%c threat %c\n", first, second);
            } else {
                isSeconed = true;
            }
            //END OF FIRST CHECK
        } 
        // SECONED CHECK
        if(isSeconed){

              // ROOK
              if (second == 'r') {
                // IF COL OR ROW ARE THE SAME ,ROOK MOVED HORIZONTALLY OR VERTICALLY
                if (row1 == row2 || col1 == col2) {
                    isThreat = true;
                } 
            }

            // KNIGHT
            if (second == 'k') {

                // ALL POSSIBLE KNIGHT EXACT MOVES
                // row+1 , col+-2
                if ((row_p1 > 0 && row_p1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_p1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p1 > 0 && row_p1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_p1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row-1 , col+-2
                if ((row_m1 > 0 && row_m1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_m1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m1 > 0 && row_m1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_m1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row+2 , col+-1
                if ((row_p2 > 0 && row_p2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_p2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p2 > 0 && row_p2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_p2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }

                // row-2 , col+-1
                if ((row_m2 > 0 && row_m2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_m2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m2 > 0 && row_m2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_m2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }
            }

            // BISHOP
            if (second == 'b') {
                
                // MAKING THEM BOTH POSITIVE TO COMPARE THEM
                if (row_diff < 0) {
                    row_diff = -row_diff;
                }
                if (col_diff < 0) {
                    col_diff = -col_diff;
                }

                // IF BOTH DIFFRENCES ARE THE SAME, BISHOP MOVED DIAGONLLY
                if (row_diff == col_diff) {
                    isThreat = true;
                }
            }

            // OUTPUT PRINT
            if (isThreat) {
                System.out.format("%c threat %c\n", second, first);
            } else {
                System.out.println("no threat");
            }
            // END OF SECONED CHECK
        }
        // END OF THREAT CHECK
    }

}// END OF MAIN
}// END OF CLASS CHESS