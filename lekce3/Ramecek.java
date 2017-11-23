public class Ramecek {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      int z = Integer.parseInt(args[2]);
      for (int i = y + 2 * z; i > 0; i--) {
      	for (int o = x + 2 * z; o > 0; o--) {
           if (i > y + z || i < z + 1) {
              System.out.print("X");
           } else if (o > x + z || o < z + 1) {
           	  System.out.print("X");
           } else {
           	  System.out.print(" ");
           }
      	}
      	System.out.print("\r\n");
      }
   }
}