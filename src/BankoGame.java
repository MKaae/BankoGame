import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BankoGame {
    public static void main(String[] args) {

        BankoBoardGenerator bbg = new BankoBoardGenerator();
        ArrayList<Integer> bankoBoards = new ArrayList<>(bbg.bankNumbersGenerator(50));
        ArrayList<Boolean> bankoBoardCheck = new ArrayList<>(Collections.nCopies(bankoBoards.size(), false));
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while(!success){
            try{
                String entry = sc.next();
                Integer.parseInt(entry);

                if(bankoBoards.contains(Integer.parseInt(entry))){
                    for(int i = 0; i < bankoBoards.size(); i++){
                        if(bankoBoards.get(i).equals(Integer.parseInt(entry))){
                            bankoBoardCheck.set(i, true);
                        }
                    }
                }

            }catch(NumberFormatException NFE){
                System.out.println("That is not a number.");
            }
        }
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