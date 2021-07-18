public class DivideByThreeFive {
    public static void main(String[] args) {
        int[] multipleOfThree = new int[33];
        int[] multipleOfFive = new int[20];
        int[] multipleOfThreeAndFive = new int[6];

        int index3 = 0;
        int index5 = 0;
        int index3and5 = 0;

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

        System.out.println("divided by 3: " );
        for (int i = 0; i < multipleOfThree.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
            System.out.println("divided by 5: " );
            for (int b = 0; b < multipleOfFive.length; b++) {
                System.out.print(b + ", ");
            }
        System.out.println();
                System.out.println("divided by 3 and 5: " );
                for (int c = 0; c < multipleOfThreeAndFive.length; c++) {
                    System.out.print(c + ", ");
                }

            }
        }
