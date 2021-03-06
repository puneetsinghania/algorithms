/**
 *
 * 0.6 Count Sort
 *     Time: O(N)
 *     Space: O(K)
 *     Runtime: ms
 *
 */
import java.util.*;

class CountSort {
    public static void sort(char[] characters) {
        int[] count = new int[26];
        for (char c : characters) {
            int index = charToIndex(c);
            if (index != -1) {
                count[index]++;
            }
        }

        int countIndex = 0, arrIndex = 0;
        while (countIndex < 26) {
            if (count[countIndex] > 0) {
                characters[arrIndex++] = (char) (97 + countIndex);
                count[countIndex]--;
            }
            if (count[countIndex] == 0) {
                countIndex++;
            }
        }
    }

    public static int charToIndex(char c) {
        int index = Character.toLowerCase(c) - 'a';
        return (index > -1 && index < 26) ? index : -1;
    }

    public static void main(String[] args) {
        final int SIZE = 200000;
        char[] characters = new char[SIZE];
        Random rand = new Random();

        for (int i = 0; i < SIZE; ++i) {
            characters[i] =  (char) ((int)'a' + rand.nextInt(26));
        }

        sort(characters);
        System.out.println(Arrays.toString(characters));
    }
}