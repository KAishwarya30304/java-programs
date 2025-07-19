import java.util.Scanner;

class TargetCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the sentence from user input
        String sentence = scanner.nextLine();

        // Read the target word length
        int targetLength = scanner.nextInt();

        // Initialize the count of words matching the target length
        int count = 0;

        // Split the sentence into words using spaces
        String[] words = sentence.split("\\s+");

        // Loop through each word and check its length
        for (String word : words) {
            // Remove any trailing punctuation (like ".", "!", "?")
            word = word.replaceAll("[^a-zA-Z]", "");

            // If the length of the word matches the target, increment the count
            if (word.length() == targetLength) {
                count++;
            }
        }

        // Print the result (number of words with the target length)
        System.out.println(count);

        // Close the scanner
        scanner.close();
    }
}



