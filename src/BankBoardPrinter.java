public class BankBoardPrinter {
    public void printWinner(String s) {
        String[] tempStr = s.split(" ");
        int[] intArr = new int[tempStr.length];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(tempStr[i]);
        }

    }
}
