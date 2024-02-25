// /*Write a program on java to Print Emoji */

public class qst10 {
    public static void main(String[] args) {
        printEmoji();
    }

    private static void printEmoji() {
        String[] emoji = {
                "  *****  ",
                " *     * ",
                "*  O O  *",
                "*   ∆   *",
                " *  -  * ",
                "  *****  "
        };

        for (String line : emoji) {
            System.out.println(line);
        }
    }
}
