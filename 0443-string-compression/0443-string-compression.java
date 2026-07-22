class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int index = 0;

        while (i < chars.length) {

            int j = i;

            // Find the end of the current group
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            int count = j - i;

            // Write the character
            chars[index++] = chars[i];

            // Write the count only if greater than 1
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[index++] = c;
                }
            }

            // Move to the next group
            i = j;
        }

        return index;
    }
}