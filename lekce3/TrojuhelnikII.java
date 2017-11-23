public class TrojuhelnikII {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      for (int i = 1; i <= x; i++) {
         for (int o = 1; o <= x; o++) {
         	if (o > x - i) {
         		System.out.print("X");
         	} else {
         		System.out.print(" ");
         	}
         }
         System.out.printf("\r\n");
      }
   }
}