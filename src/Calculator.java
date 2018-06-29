public class Calculator {

    public static void relations(int[] numbers) {
        int numNums = numbers.length;
        int maxResults = factorial(numNums);
        getAllResults(numbers,maxResults, numNums);
    }

    public static void getAllResults(int[] numbers, int maxResults, int numNums) {
        int count = 0;
        String[][] multiplyResults = new String[maxResults][2];
        String[][] subtractionResults = new String[maxResults][2];
        String[][] additionResults = new String[maxResults][2];
        String[][] divisionResults = new String[maxResults][2];

        for (int j = 0; j < numNums; j++) {
            for (int i = 0; i <numNums; i++) {
                if(i == j) {
                    continue;
                }
                multiplyResults[count][0] = "" + (numbers[j] * numbers[i]);
                multiplyResults[count][1] = numbers[j] + " * " + numbers[i];
                subtractionResults[count][0] = "" + (numbers[j] - numbers[i]);
                subtractionResults[count][1] = numbers[j] + " - " + numbers[i];
                additionResults[count][0] = "" + (numbers[j] + numbers[i]);
                additionResults[count][1] = numbers[j] + " + " + numbers[i];
                divisionResults[count][0] = "" + ((double)(numbers[j] / numbers[i]));
                divisionResults[count][1] = numbers[j] + " / " + numbers[i];
                count++;
            }
        }

        try {

            for (int i = 0; i < maxResults; i++) {

                for (int j = 0; j < numNums; j++) {
                    if (numbers[j] == Integer.parseInt( multiplyResults[i][0] )) {
                        System.out.println( numbers[j] + " = " + multiplyResults[i][1] );
                    } else if (numbers[j] == Integer.parseInt( subtractionResults[i][0] )) {
                        System.out.println( numbers[j] + " = " + subtractionResults[i][1] );
                    } else if (numbers[j] == Integer.parseInt( additionResults[i][0] )) {
                        System.out.println( numbers[j] + " = " + additionResults[i][1] );
                    } else if ((double)numbers[j] == Double.parseDouble( divisionResults[i][0] )) {
                        System.out.println( numbers[j] + " = " + divisionResults[i][1] );
                    } else {

                    }
                }
            }
        } catch (Exception e) {
            System.out.println("There is something wrong with the numbers?! :/" + e.getMessage());
        }
    }
    public static int factorial(int num) {
        int total = 1;
        while (num!=0) {
            total = total * num;
            num--;
        } return total;
    }

    public static void main(String[] args) {
        int[] input = {4, 2, 8};
        relations(input);
    }
}
