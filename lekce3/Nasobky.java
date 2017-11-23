public class Nasobky {
   public static void main(String[] args) {
   	  int a = Integer.parseInt(args[0]);
   	  int b = Integer.parseInt(args[1]);
   	  int x = 1;
      for (int i = 0; i <= a * 10; i += a) {
      	 if (i < 10) {
            System.out.print(" ");
         }
         System.out.print(i + " ");
         if (x == b) {
            System.out.print("\r\n");
         	x = 1;
         } else {
         	x++;
         }
      }
   }
}