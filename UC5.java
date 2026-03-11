public class UC5 {
    public static void main(String[] args) {
        // Declare and initialize the array in one go using String.join()
        String[] banner = {
        String.join(" ", "   ***    ", "   ***    ", "  ****** ", "   *****  "),
        String.join(" ", "  **  **  ", "  **  **  ", "  **   ** ", " **   ** "),
        String.join(" ", " **    ** ", " **    ** ", "  **   ** ", " **      "),
        String.join(" ", " **    ** ", " **    ** ", "  ******  ", "  *****  "),
        String.join(" ", " **    ** ", " **    ** ", "  **      ", "      ** "),
        String.join(" ", "  **  **  ", "  **  **  ", "  **      ", " **   ** "),
        String.join(" ", "   ***    ", "   ***    ", "  **      ", "  *****  "),
        };

    
        for (String line : banner) {
            System.out.println(line);
        }
    }
}