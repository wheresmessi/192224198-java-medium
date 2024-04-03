public class five {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println("Input: ransomNote = \"" + ransomNote + "\", magazine = \"" + magazine + "\"");

        int[] count = new int[26]; // Array to count occurrences of each character in magazine

        // Count occurrences of each character in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                System.out.println("Output: " + false); // If a required character is not present in magazine, return false
                return;
            } else {
                count[ch - 'a']--; // Decrement the count of the character in magazine
            }
        }

        System.out.println("Output: " + true); // If all characters in ransomNote are found in magazine, return true
    }
}
