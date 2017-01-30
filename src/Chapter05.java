/**
 * Created by Lihao on 1/29/17.
 * Chapter 05 - Bit Manipulation
 */

/**
 *
 * 5.1 Insertion
 *     You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
 *     method to inert M into N such that M starts at bit j and ends at bit i. You can
 *     assume that the bit j though i have enough space to fit all of M. That is, if
 *     M = 10011, you can assume that there are at least 5 bit between j and i. You would
 *     not, for example, have j = 3 and i = 2, because M could not fully fit between bit
 *     3 and bit 2.
 *     Example:
 *         Input:  N = 10000000000, M = 10011, i = 2, j =6
 *         Output: N = 10001001100
 *
 *
 */
class Insertion {
    // My Solution
    public int updateBits(int m, int n, int i, int j) {
        int mask = 0;
        for (int index = i; index <= j; ++index) {
            mask |= (1 << i);
        }
        mask = ~ mask;
        n &= mask;

        m = (m << i);
        n |= m;
        return n;
    }

    // Book Solution
    public int updateBits2(int m, int n, int i, int j) {
        int AllOne = ~0;
        int leftMask = (AllOne << (j + 1));
        int rightMask = (1 << i) - 1;
        int mask = leftMask | rightMask;
        int n_cleared = n & mask;
        int m_shifted = m << i;
        int answer = n_cleared | m_shifted;
        return answer;
    }


}

/**
 *
 * 5.2 Binary to String
 *     Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double,
 *     print the binary representation, if the number cannot be represented accurately
 *     in binary with at most 32 characters, print "ERROR"
 *
 */


/**
 *
 * 5.3 Flip Bit to Win
 *     You have an integer and you can flip exactly one bit from a 0 to a 1. Write code
 *     to find the length of the longest sequence of 1s you could create.
 *
 */


/**
 *
 * 5.4 Next Number
 *     Given a positive integer, print the next smallest and the next largest number that
 *     have the same number of 1 bits in their binary representation.
 *
 */


/**
 *
 * 5.5 Debugger
 *     Explain what the following code does: (((n&(n-1))==0).
 *
 */


/**
 *
 * 5.6 Conversion
 *     Write a function to determine the number of bits you would need to flip to convert
 *     integer A to integer B.
 *     Example:
 *     Input:  29 (or: 11101), 15 (orL 01111)
 *     Output: 2
 *
 */


/**
 *
 * 5.7 Pairwise Swap
 *     Write a program to swap odd and even bits in an integer with as few instructions as
 *     possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
 *
 */


/**
 *
 * 5.8 Draw Line
 *     A monochrome screen is stored as a single array of bytes, allowing eight consecutive
 *     pixels to be stored in one byte. The screen has width w, where w is divisible by 8
 *     (that is, no byte will be slop across rows). The height of the screen, of course,
 *     can be derived from the length of the array and the width. Implement of function
 *     that draw a horizontal line from (x1, y) to (x2, y).
 *     The method signature should look something like:
 *     drawLine(byte[] screen, int width, int x1, int x2, int y)
 *
 */
