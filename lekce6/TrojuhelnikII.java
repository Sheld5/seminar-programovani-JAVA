public class Trojuhelnik {
    public static void main(String[] args) {
        /* Program, co nakresli trojuhelnik. */
        for (int y = 0; y < 7; y = y + 1) {
            for (int x = 0; x <= y; x = x + 1) {
                System.out.printf("X");
            }
            System.out.println("");
        }
    }
}