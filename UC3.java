public class UC2 {

   public static void main(String[] args) {
      System.out.println("Tic Tac Toe");
      char[][] gameBoard = initBoard();
      System.out.println("Board is initialized");
      start();
   }

   private static char[][] initBoard() {

      char[][] gameBoard = {  {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '} };
      return gameBoard;
   }

   private static void start() {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter your toss (1)head : (0)tail :");
      int userToss=scan.nextInt();
      checkToss(userToss);
		printGameBoard(gameBoard);
   }

   private static void checkToss(int userToss) {
      int checkingToss = (int)Math.floor((Math.random()*10)%2+1);
      if(userToss == checkingToss)
      {
         System.out.println("You won the toss");
      }
      else
      {
         System.out.println("CPU won the toss");
         System.out.println("cpu turn::");
      }
         chooseSymbol(userToss);
   }

	private static void printGameBoard(char[][] gameBoard) {
		
		for(char[] row:gameBoard)
		{
			for(char col:row)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

   private static void chooseSymbol(int userToss) {
      int playerFlag = 0;
      if (playerFlag == userToss)
      {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter your symbol (1) X - (0) O :");
      int userSymbol=scan.nextInt();
      setChooseSymbol(userSymbol);
      }
      else
      {
         int userSymbol = (int)Math.floor(Math.random()*10)%2+1;
         setChooseSymbol(userSymbol);
      }
      System.out.println("playerSymbol : "+ playerSymbol+ "\ncpuSymbol : "+ cpuSymbol);
   }

      private static void setChooseSymbol(int userSymbol) {

      if(userSymbol == 1)
      {
         playerSymbol = "X";
         cpuSymbol = "O";
      }
      else
      {
         playerSymbol = "O";
         cpuSymbol = "X";
      }

   }
}
