public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexicographically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b) {
        int minLength = Math.min(a.length, b.length);
        
        // Iterate over both arrays
        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1; // A is less than B
            } else if (a[i] > b[i]) {
                return 1; // A is greater than B
            }
            // If characters at this position are equal, continue to next position
        }
        
        // If we reach here, it means the common part of the arrays is identical
        // Check the lengths to determine if one array is a prefix of the other
        if (a.length < b.length) {
            return -1; // A is a prefix of B
        } else if (a.length > b.length) {
            return 1; // B is a prefix of A
        } else {
            return 0; // Both arrays are identical
        }
    }
}
