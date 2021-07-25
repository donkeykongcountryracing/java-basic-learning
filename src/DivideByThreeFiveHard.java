public class DivideByThreeFiveHard {
    public static void main(String[] args) {
        //this is an array and this is the number of multiples in three five and 15
        int[] multipleOfThree = new int[33];
        int[] multipleOfFive = new int[20];
        int[] multipleOfThreeAndFive = new int[6];

        //this is the index of each of the multiples in the arrays above
        int index3 = 0;
        int index5 = 0;
        int index3and5 = 0;
        //i used multiple ifs because if i use if else it would be connected to the first if, for example, if fifteen was x then it would be
        //only go to index and if else would not count. so i made the ifs sepearate so ic an track each integer individually
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                multipleOfThree[index3] = x;
                index3++;
            }
            if (x % 5 == 0) {
                multipleOfFive[index5] = x;
                index5++;
            }
            if (x % 15 == 0) {
                multipleOfThreeAndFive[index3and5] = x;
                index3and5++;
            }
        }

        System.out.println("divided by 3: ");
        for (int i = 0; i < multipleOfThree.length; i++) {
            System.out.print(multipleOfThree[i] + ", ");// the bracket in the array shows the position of each number and the value that corresponds with it
        }
        System.out.println();
        System.out.println("divided by 5: ");
        for (int b = 0; b < multipleOfFive.length; b++) {
            System.out.print(multipleOfFive[b] + ", ");
        }
        System.out.println();
        System.out.println("divided by 3 and 5: ");
        for (int c = 0; c < multipleOfThreeAndFive.length; c++) {
            System.out.print(multipleOfThreeAndFive[c] + ", ");
        }

    }
}
