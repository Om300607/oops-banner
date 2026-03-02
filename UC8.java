import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // HashMap to store character patterns
    private static final Map<Character, String[]> characterPatterns = new HashMap<>();

    // Static block to initialize patterns
    static {
        characterPatterns.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        characterPatterns.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        characterPatterns.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    // Function to render a word as banner
    public static void renderBanner(String word) {
        // Assume all patterns have 5 rows
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        // Build banner row by row
        for (char c : word.toCharArray()) {
            String[] pattern = characterPatterns.get(c);
            if (pattern != null) {
                for (int i = 0; i < pattern.length; i++) {
                    lines[i].append(pattern[i]).append("  "); // spacing between letters
                }
            }
        }

        // Print the banner
        for (StringBuilder line : lines) {
            System.out.println(line.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }
}