import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UC4 {

	private static String playerSymbol="";
	private static String cpuSymbol="";
	static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		System.out.println("Tic Tac Toe");
		start();
		
	}

	private static void start() {

			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your toss (1)head : (0)tail :");
			int userToss=scan.nextInt();
			checkToss(userToss);	
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
		char[][] gameBoard = initBoard();
		System.out.println("Printing the Board ::");
		printGameBoard(gameBoard);
		
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Entert your placements (1-9) :");
			int playerPos = scan.nextInt();
			while(playerPosition.contains(playerPos)) {
				System.out.println("Enter the correct position already positon taken!");
				playerPos = scan.nextInt();
				}
			moveInCell(gameBoard, playerPos, "player");
			printGameBoard(gameBoard);

		}
	}

	private static void moveInCell(char[][] gameBoard, int pos, String user) {
		
		char symbol = ' ';
		if(user.equals("player"))
		{
			symbol = 'X';		}
		else if(user.equals("cpu"))
		{
			symbol = 'O';
		}	
		switch(pos) {
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
			default:
				break;
		}
		
	}

	private static char[][] initBoard() {
		
		char[][] gameBoard = {  {' ', '|', ' ', '|', ' '},
								{'-', '+', '-', '+', '-'},
								{' ', '|', ' ', '|', ' '},
								{'-', '+', '-', '+', '-'},
								{' ', '|', ' ', '|', ' '} };
		return gameBoard;
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
