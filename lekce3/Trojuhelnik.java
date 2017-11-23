public class Trojuhelnik {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      for (int i = 1; i <= x; i++) {
         for (int o = 1; o <= i; o++) {
         	System.out.print("X");
         }
         System.out.printf("\r\n");
      }
   }
}