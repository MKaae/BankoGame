import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class BankoBoardGenerator {
    public ArrayList<Integer> bankNumbersGenerator(int size){
        ArrayList<Integer> bankoBoard = new ArrayList<>();
        ArrayList<Integer> tempNumbers = new ArrayList<>();
        Random r = new Random();
        int counter = 0;

        while(size != 0){

           int tNumber = r.nextInt(90-1)+1;

           if(!tempNumbers.contains(tNumber) && checkTenths(tempNumbers, tNumber)){
               tempNumbers.add(tNumber);
           }
           if(tempNumbers.size() == 5){
               Collections.sort(tempNumbers);
               for(int i = 0; i <= 4; i++){
                   bankoBoard.add(tempNumbers.get(i));
               }
               tempNumbers.clear();
               counter++;
           }
           if(counter == 3 && checkUniqueNumberSets(bankoBoard)){
               counter = 0;
               size--;
           }
           else if(counter == 3 && !checkUniqueNumberSets(bankoBoard)){
               for(int j = 1; j <= 15; j++){
                   bankoBoard.remove(bankoBoard.size()-1);
               }
               counter = 0;
           }
        }
        return bankoBoard;
    }
    public boolean checkTenths(ArrayList<Integer> list, int temp){
        boolean success = true;
        for (Integer integer : list) {
            if (String.valueOf(integer).substring(0, 1).equals(String.valueOf(temp).substring(0, 1))) {
                success = false;
                break;
            }
        }
        return success;
    }
    public boolean checkUniqueNumberSets(ArrayList<Integer> board){
        boolean success = true;
        int counter = 0;
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            tempList.add(board.get(board.size()-i));
        }
        for(int j = 1; j*15 < board.size(); j++){
            for(int k = 0; k <= 14; k++){
                if(tempList.get(k).equals(board.get(j+k))){
                    counter++;
                }
                if(counter == 15){
                    success = false;
                    break;
                }
            }
        }
        return success;
    }
    public HashMap<Integer, String> gameBoards(ArrayList<Integer> input){
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        String tempStr = "";
        int counter = 0;
        for(int i = 0; i <= input.size()-1; i = i+15){
            for(int j = 0; j <= 14; j++){
                tempStr += input.get(i + j) + " ";
            }
            map.put(counter, tempStr);
            tempStr = "";
            counter++;
        }
        return map;
    }
}