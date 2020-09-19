package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    private final static char EMPTY_CELL = ' ';
    private static final int[][] correctResponses = new int[][]{{0, 1, 2},{3,4,5},{6,7,8},
                                        {0,3,6},{1,4,7},{2,5,8},
                                        {0,4,8},{2,4,6}
                                       };

    private static void printTable(String currentGame) {
        String currentGameClean = currentGame.replace(EMPTY_CELL,' ');
        int counter=0;
        System.out.println("---------");
        while (counter<9){
            if (counter%3==0){
                System.out.print("| ");
            }
            System.out.print(currentGame.charAt(counter)+" ");
            if (counter%3==2){
                System.out.print("|\n");
            }
            counter++;
        }
        System.out.println("---------");
    }

    public static void main(String[] args) {
//        String nL = "\n";
//        System.out.print("Enter cells: ");
//        String symbols = scanner.next();
        int moves= 0;
//        String symbols = "_________";
        String symbols = "         ";
        String state;
        boolean notFinished= true;
        printTable(symbols);
        do {
            symbols = nextTurn(symbols,((moves%2)==0)?'X':'O');
            state =checkState(symbols);
            notFinished = state.equals("Game not finished");
            if(!notFinished) {
                System.out.println(state);
            }else{
                moves++;
            }
        }while (notFinished);

//        String currentState = checkState(symbols.replace(' ',EMPTY_CELL).toUpperCase());
//        System.out.println(currentState);
    }

    private static String nextTurn(String currentState,char turnValue) {
        String reply;
//        printTable(currentState);
        while (true) {
            System.out.print("Enter the coordinates: ");
                try{
                    String coordinates= scanner.nextLine();
                    String[] coordArray = coordinates.trim().split(" ");
//                    System.out.println(coordinates);
//                    System.out.println(Arrays.toString(coordArray));
                    int x = Integer.parseInt(coordArray[0]);
//                    int x = scanner.nextInt();
                    int y = Integer.parseInt(coordArray[1]);
//                    int y = scanner.nextInt();
                    if(!(x>0 && x<4) || !(y>0 && y<4)) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }else{
                        int idx = (x-1) + ((3-y)*3);
                        if (currentState.charAt(idx) == EMPTY_CELL){
                            StringBuilder newState = new StringBuilder(currentState);
                            newState.setCharAt(idx, turnValue);
                            printTable(newState.toString());
                            reply = newState.toString();
                            break;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    }
                }catch (Exception ex){
//                    ex.printStackTrace();
                    System.out.println("\nYou should enter numbers!");
//                    break;
                }

        }
        return reply;
    }

    private static String checkState(String currentGame) {
//        System.out.println("Given: "+currentGame);
        // when the field has three X in a row as well as three O in a row.
        // Or the field has a lot more X's than O's or vice versa (if the difference is 2 or more, should be 1 or 0).
        String state = "Impossible";
        int xWins = 0;
        int oWins = 0;
        boolean hasEmptyCells = currentGame.contains(Character.toString(EMPTY_CELL));

        //Count plays
        char valueToCheck;
        int countX = 0;
        int countO = 0;
        int countSpaces = 0;
        for (int i = 0; i < currentGame.length(); i++) {
            valueToCheck = currentGame.charAt(i);
            if (valueToCheck == 'X') {
                countX++;
            }else if (valueToCheck == 'O') {
                countO++;
            }else if (valueToCheck == EMPTY_CELL) {
                countSpaces++;
            }
        }

        for (int[] correctRespons : correctResponses) {
            valueToCheck = currentGame.charAt(correctRespons[0]);
            if (valueToCheck != EMPTY_CELL) {
                if (valueToCheck == currentGame.charAt(correctRespons[1]) && valueToCheck == currentGame.charAt(correctRespons[2])) {
                    if (valueToCheck == 'X') xWins++;
                    else oWins++;
                }
            }
        }

        if (xWins==0 && oWins==0){
            if (hasEmptyCells){
                if(Math.abs(countO-countX)<=1){
                    state = "Game not finished";
                }
            }else{
                state = "Draw";
            }

        }else if (xWins==1 && oWins==0){
            state = "X wins";
        }else if (oWins==1 && xWins==0){
            state = "O wins";
        }
        return state;
    }
}
