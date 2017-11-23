public class Prvocisla {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      for (int i = 2 ; x != 1; i++) {
         for ( ;x % i == 0; x = x / i) {
      	    System.out.print(i + " ");
         }
      }
   }
}