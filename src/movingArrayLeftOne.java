import java.util.Scanner;

public class movingArrayLeftOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Boy, how long do you want the array to be?");
        int lengthOfArray = sc.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("write the numbers in your array");
        for (int y = 0; y < lengthOfArray; y++) {
            int arrayContents = sc.nextInt();
            array[y] = arrayContents;
        }
        for (int y = 0; y < lengthOfArray; y++) {
            System.out.print(array[y] + " ");
        }
        System.out.println();

        int[] newArray = new int[lengthOfArray];
        newArray[lengthOfArray - 1] = array[0];
        for (int x = 0; x < lengthOfArray - 1; x++) {
            newArray[x] = array[x + 1];//have to find a way to not make array and new array reference each other
            System.out.print(newArray[x] + " ");
        }
        System.out.print(newArray[lengthOfArray - 1]);

    }
}


//        int arrayLength = array.length - 1;
//        int indexOfOrigArray = 0;   THIS WAS REVERSING THE ARRAY
//        int[] copyArray = new int[array.length];
//        for (int i = arrayLength; i >= 0; i--) {
//            copyArray[i] = array[indexOfOrigArray];
//            indexOfOrigArray++;
//        }
//        for (int z = 0; z < array.length; z++) {
//            System.out.print(copyArray[z]);
//        }