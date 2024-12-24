import java.util.ArrayList;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test 1: Get Ten Rolls
        System.out.println("\n----- Get Ten Rolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Random Rolls: " + randomRolls);

        // Test 2: Get Random Letter
        System.out.println("\n----- Get Random Letter Test -----");
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        // Test 3: Generate Password
        System.out.println("\n----- Generate Password Test -----");
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);

        // Test 4: Get New Password Set
        System.out.println("\n----- Get New Password Set Test -----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Password Set: " + passwordSet);

        // Test 5: Shuffle Array
        System.out.println("\n----- Shuffle Array Test -----");
        int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: ");
        for (int num : sampleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        generator.shuffleArray(sampleArray);
        System.out.println("Shuffled Array: ");
        for (int num : sampleArray) {
            System.out.print(num + " ");
        }
    }
}
