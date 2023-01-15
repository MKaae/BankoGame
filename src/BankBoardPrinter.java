public class BankBoardPrinter {
    public void printWinner(String s) {
        String[] tempStr = s.split(" ");
        int[] intArr = new int[tempStr.length];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(tempStr[i]);
        }
        String[] firstLine = {"", "", "", "", "", "", "", "", ""};
        String[] secondLine = {"", "", "", "", "", "", "", "", ""};
        String[] thirdLine = {"", "", "", "", "", "", "", "", ""};
        for(int i = 0; i <= 4; i++){
            if(intArr[i] <= 10){
                firstLine[0] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 20 && intArr[i] > 10){
                firstLine[1] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 30 && intArr[i] > 20){
                firstLine[2] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 40 && intArr[i] > 30){
                firstLine[3] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 50 && intArr[i] > 40){
                firstLine[4] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 60 && intArr[i] > 50){
                firstLine[5] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 70 && intArr[i] > 60){
                firstLine[6] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 80 && intArr[i] > 70){
                firstLine[7] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 90 && intArr[i] > 80){
                firstLine[8] = String.valueOf(intArr[i]);
            }
        }
        for(int i = 5; i <= 9; i++){
            if(intArr[i] <= 10){
                secondLine[0] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 20 && intArr[i] > 10){
                secondLine[1] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 30 && intArr[i] > 20){
                secondLine[2] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 40 && intArr[i] > 30){
                secondLine[3] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 50 && intArr[i] > 40){
                secondLine[4] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 60 && intArr[i] > 50){
                secondLine[5] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 70 && intArr[i] > 60){
                secondLine[6] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 80 && intArr[i] > 70){
                secondLine[7] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 90 && intArr[i] > 80){
                secondLine[8] = String.valueOf(intArr[i]);
            }
        }
        for(int i = 9; i <= 14; i++){
            if(intArr[i] <= 10){
                thirdLine[0] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 20 && intArr[i] > 10){
                thirdLine[1] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 30 && intArr[i] > 20){
                thirdLine[2] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 40 && intArr[i] > 30){
                thirdLine[3] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 50 && intArr[i] > 40){
                thirdLine[4] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 60 && intArr[i] > 50){
                thirdLine[5] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 70 && intArr[i] > 60){
                thirdLine[6] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 80 && intArr[i] > 70){
                thirdLine[7] = String.valueOf(intArr[i]);
            }
            if(intArr[i] <= 90 && intArr[i] > 80){
                thirdLine[8] = String.valueOf(intArr[i]);
            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n", "1-10", "11-20", "21-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("|  %-4s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|\n", firstLine[0], firstLine[1], firstLine[2], firstLine[3], firstLine[4], firstLine[5], firstLine[6], firstLine[7], firstLine[8]);
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("|  %-4s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|\n", secondLine[0], secondLine[1], secondLine[2], secondLine[3], secondLine[4], secondLine[5], secondLine[6], secondLine[7], secondLine[8]);
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("|  %-4s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|  %-5s|\n", thirdLine[0], thirdLine[1], thirdLine[2], thirdLine[3], thirdLine[4], thirdLine[5], thirdLine[6], thirdLine[7], thirdLine[8]);
        System.out.println("------------------------------------------------------------------------");
    }
}
