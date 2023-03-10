import java.util.*;

public class BankoGame implements CheckingForWins{
    public static void main(String[] args) {
        BankoGame bg = new BankoGame();
        BankBoardPrinter printer = new BankBoardPrinter();
        BankoBoardGenerator bbg = new BankoBoardGenerator();
        ArrayList<Integer> bankoNumbers = new ArrayList<>(bbg.bankNumbersGenerator(50));
        ArrayList<Boolean> bankoBoardCheck = new ArrayList<>(Collections.nCopies(bankoNumbers.size(), false));
        HashMap<Integer, String> bankoBoards = new HashMap<>(bbg.gameBoards(bankoNumbers));
        ArrayList<Integer> drawnNumbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean success = false;

        while(!success){
            try {
                System.out.println("Press [1] to draw a new number. Press [2] to check a banko board.");
                int select = Integer.parseInt(sc.next());
                switch (select) {
                    case 1:
                        boolean success2 = false;
                        while(!success2) {
                            int entry = r.nextInt(90 - 1) + 1;
                            if (drawnNumbers.size() == 0 || !drawnNumbers.contains(entry)) {
                                drawnNumbers.add(entry);
                                System.out.println(entry);
                                if (bankoNumbers.contains(entry)) {
                                    for (int i = 0; i < bankoNumbers.size(); i++) {
                                        if (bankoNumbers.get(i).equals(entry)) {
                                            bankoBoardCheck.set(i, true);
                                        }
                                    }
                                }
                                success2 = true;
                            }
                        }
                        System.out.println(bankoBoardCheck);
                        break;
                    case 2:
                        System.out.println("Enter caller ID.");
                        int callerID = Integer.parseInt(sc.next());
                        boolean winner = bg.checkBooleans(callerID, bankoBoardCheck);
                        if(winner){
                            System.out.println(callerID + " is a winner.");
                            printer.printWinner(bankoBoards.get(callerID));
                            break;
                        }
                        System.out.println("Not a winner.");
                        break;
                    case 3:
                        success = true;
                        break;
                }
                }catch(NumberFormatException NFE){
                    System.out.println("That is not a number.");
                }
        }
    }
    @Override
    public boolean checkBooleans(int callerID, ArrayList<Boolean> list) {
        System.out.println("Check for how many numbers of rows [1], [2], [3]");
        Scanner sc = new Scanner(System.in);
        boolean success = false;
        boolean winner = true;
        int counter = 0;
        int plateID = callerID*15;
        boolean[] plateNumbers = new boolean[15];
        for(int i = plateID; i <= plateID+14; i++){
                plateNumbers[counter] = list.get(i);
                counter++;
        }
        System.out.println("");
        while(!success) {
            try {
                int select = Integer.parseInt(sc.next());
                switch(select){
                    case 1:
                        int counter1 = 0;
                        for(int i = 0; i <= plateNumbers.length-1; i = i+5){
                            if(counter1 == 5 && i != 0) {
                                success = true;
                                break;
                            }
                            for(int j = 0; j <= 4; j++){
                                if(!plateNumbers[i+j]){
                                    winner = false;
                                    counter1 = 0;
                                }
                                counter1++;
                            }
                        }
                        success = true;
                        break;
                    case 2:
                        for(int i = 0; i <= 9; i++){
                            if (!plateNumbers[i]){
                                winner = false;
                                break;
                            }
                        }
                        for(int i = 5; i <= 14; i++){
                            if (!plateNumbers[i]) {
                                winner = false;
                                break;
                            }
                        }
                        success = true;
                        break;
                    case 3:
                        for(int i = 0; i <= plateNumbers.length-1; i++){
                            if(!plateNumbers[i]){
                                winner = false;
                                break;
                            }
                        }
                        success = true;
                        break;
                }

            } catch (NumberFormatException NFE) {
                System.out.println("That is not a number.");
            }
        }
        return winner;
    }
}
/*When the game begins everyone has empty plates.
The Caller randomly draws a number and tells it loud and clear.
Every player, with that number on a plate(s), covers the number with
a plastic chip.
The Caller draws a new number and continues to repeat that until
one (or eventually more) player(s) claim ???BANKO??? for the first row
filled (the 5 numbers are covered).
The plate unique number is checked and the player receives the prize.
The Caller continues until a player claims ???BANKO??? for two filled
rows. The number is checked, prize given and the game continues
with the third and last round, where the claim ???BANKO??? means a
completed plate i.e. all 3 rows are covered. The prize here is usually
much larger than the previous two*/