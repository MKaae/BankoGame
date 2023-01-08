import java.util.ArrayList;

public class BankoGame {
    public static void main(String[] args) {
        BankoBoardGenerator bbg = new BankoBoardGenerator();
        ArrayList<Integer> b = new ArrayList<>(bbg.bankNumbersGenerator(500));
        System.out.println(b);
        System.out.println(b.size());

    }
}