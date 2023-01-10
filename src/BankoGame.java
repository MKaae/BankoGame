import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BankoGame implements CheckingForWins{
    public static void main(String[] args) {

        BankoBoardGenerator bbg = new BankoBoardGenerator();
        ArrayList<Integer> bankoBoards = new ArrayList<>(bbg.bankNumbersGenerator(50));
        ArrayList<Boolean> bankoBoardCheck = new ArrayList<>(Collections.nCopies(bankoBoards.size(), false));
        ArrayList<Integer> drawnNumbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean success = false;

        while(!success){
            try {
                System.out.println("Press [1] to draw a new number. Press [2] to check a banko board.");
                String select = sc.next();
                Integer.parseInt(select);
                switch (Integer.parseInt(select)) {
                    case 1:
                        boolean success2 = false;
                        while(!success2) {
                            int entry = r.nextInt(90 - 1) + 1;
                            if (drawnNumbers.size() == 0 || !drawnNumbers.contains(entry)) {
                                drawnNumbers.add(entry);
                                System.out.println(entry);
                                if (bankoBoards.contains(entry)) {
                                    for (int i = 0; i < bankoBoards.size(); i++) {
                                        if (bankoBoards.get(i).equals(entry)) {
                                            bankoBoardCheck.set(i, true);
                                        }
                                    }
                                }
                                success2 = true;
                            }
                        }
                        System.out.println(bankoBoardCheck);
                    case 2:
                }
                }catch(NumberFormatException NFE){
                    System.out.println("That is not a number.");
                }
        }
    }
    @Override
    public boolean checkBooleans(ArrayList<Boolean> list) {
        return true;
    }
}
/*When the game begins everyone has empty plates.
The Caller randomly draws a number and tells it loud and clear.
Every player, with that number on a plate(s), cover the number with
a plastic chip.
The Caller draws a new number and continues to repeat that until
one (or eventually more) player(s) claim “BANKO” for the first row
filled (the 5 numbers are covered).
The plate unique number is checked and the player receives the prize.
The Caller continues until a player claims “BANKO” for two filled
rows. The number is checked, prize given and the game continues
with the third and last round, where the claim “BANKO” means a
completed plate i.e. all 3 rows are covered. The prize here is usually
much larger than the previous two*/