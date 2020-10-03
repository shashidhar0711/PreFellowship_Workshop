public class UC1 {

   public static void main(String[] args) {
      System.out.println("Tic Tac Toe");
      char[][] gameBoard = initBoard();
      System.out.println("Board is initialized");
   }

   private static char[][] initBoard() {

      char[][] gameBoard = {  {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '} };
      return gameBoard;
   }
}
