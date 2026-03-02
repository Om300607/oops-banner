import java.util.HashMap;
import java.util.Map;

public class UC7 {

    // CharacterPattern class to encapsulate character and its ASCII art
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static inner class to store mappings of characters to patterns
    static class CharacterPatternMap {
        private static Map<Character, CharacterPattern> map = new HashMap<>();

        static {
            map.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }));

            map.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            }));
        }

        public static CharacterPattern get(char c) {
            return map.get(c);
        }
    }

    // Main method to display the banner
    public static void main(String[] args) {
        String word = "OOPS";
        StringBuilder[] lines = new StringBuilder[5]; // 5 rows for ASCII art

        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            CharacterPattern cp = CharacterPatternMap.get(c);
            if (cp != null) {
                String[] pattern = cp.getPattern();
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
}