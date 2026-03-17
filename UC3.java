public class UC3 {
    public static void main(String[] args) {
        // If user provides a name, use it
        // Otherwise default to "World"
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello " + name);
    }
}