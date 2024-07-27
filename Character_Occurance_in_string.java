package strings;


import java.util.*;

public class Character_Occurance_in_string {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Initialize an array to keep track of the frequency of each character
        // Assuming the input string contains only lowercase letters a-z
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);

            // Calculate the index for the character in the frequency array
            // 'a' corresponds to index 0, 'b' to index 1, ..., 'z' to index 25
            int idx = (int) ch - 97;

            // Increment the frequency count for the character
            freq[idx]++;
        }

        // Initialize a variable to keep track of the maximum frequency
        int maxfreq = -1;

        // Find the maximum frequency in the frequency array
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= maxfreq) {
                maxfreq = freq[i];
            }
        }

        // Print the characters with the maximum frequency
        System.out.println("Alphabets with Maximum frequency:");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxfreq) {
                // Convert the index back to the corresponding character
                char ch = (char) (i + 97);
                System.out.println(ch + " ");
            }
        }
    }
}

        