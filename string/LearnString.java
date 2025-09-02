package src.string;



import java.util.*;
import java.util.regex.*;

public class LearnString {

    // ====================== THEORY ======================
    /*
     * 1. String Basics:
     *    - Strings are immutable in Java (cannot be changed after creation).
     *    - Stored in the String Pool (for reuse).
     *    - Use `==` for reference comparison, `.equals()` for content comparison.
     *
     * 2. String vs StringBuilder vs StringBuffer:
     *    - String: Immutable (thread-safe).
     *    - StringBuilder: Mutable (not thread-safe, faster).
     *    - StringBuffer: Mutable (thread-safe, slower).
     *
     * 3. Common Operations:
     *    - Concatenation, Substring, Searching, Replacing, Splitting.
     */

    // ====================== COMMON STRING METHODS ======================
    public static void stringMethods() {
        String s = "  Hello, World!  ";

        // Length and checks
        System.out.println("Length: " + s.length());
        System.out.println("Is empty: " + s.isEmpty());
        System.out.println("Is blank: " + s.isBlank());

        // Character access
        System.out.println("Char at index 1: " + s.charAt(1));

        // Substring
        System.out.println("Substring (7-12): " + s.substring(7, 12));

        // Comparison
        System.out.println("Equals 'hello': " + s.trim().equalsIgnoreCase("hello, world!"));

        // Searching
        System.out.println("Index of 'World': " + s.indexOf("World"));
        System.out.println("Contains 'Hello': " + s.contains("Hello"));

        // Modification (returns new string)
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Trimmed: '" + s.trim() + "'");
        System.out.println("Replace 'l' with 'x': " + s.replace('l', 'x'));

        // Splitting
        String[] words = s.trim().split(",");
        System.out.println("Split by ',' : " + Arrays.toString(words));

        // Formatting
        String formatted = String.format("Formatted: %s", s.trim());
        System.out.println(formatted);
    }

    // ====================== STRING PATTERNS ======================
    /*
     * 1. Two Pointers:
     *    - Used for palindromes, reversing, comparing strings.
     *    - Example: Valid Palindrome, Reverse Words.
     *
     * 2. Sliding Window:
     *    - Used for substring problems (e.g., longest substring without repeating chars).
     *    - Example: Longest Substring Without Repeating Characters.
     *
     * 3. Hash Map / Frequency Counting:
     *    - Used for anagrams, counting characters.
     *    - Example: Group Anagrams, Valid Anagram.
     *
     * 4. Dynamic Programming:
     *    - Used for complex string problems (e.g., edit distance, longest palindromic substring).
     *    - Example: Longest Palindromic Substring.
     *
     * 5. Trie (Prefix Tree):
     *    - Used for prefix-based searches (e.g., autocomplete).
     *    - Example: Implement Trie.
     */

    // ====================== IMPORTANT STRING PROBLEMS ======================

    // 1. Reverse a String (Two Pointers)
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // 2. Check if Palindrome (Two Pointers)
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 3. Longest Substring Without Repeating Characters (Sliding Window)
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // 4. Group Anagrams (Hash Map)
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    // 5. Valid Anagram (Frequency Counting)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }

    // ====================== MAIN METHOD FOR TESTING ======================
    public static void main(String[] args) {
        // Test String Methods
        System.out.println("=== String Methods ===");
        stringMethods();

        // Test Problems
        System.out.println("\n=== String Problems ===");
        System.out.println("Reversed 'hello': " + reverseString("hello"));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
        System.out.println("Longest substring without repeating chars in 'abcabcbb': " +
                lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Are 'anagram' and 'nagaram' anagrams? " + isAnagram("anagram", "nagaram"));

        // Group Anagrams Example
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped Anagrams: " + groupAnagrams(strs));
    }
}

