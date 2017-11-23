public class Delitele {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      for (int i = x; i > 0; i--) {
      	if (x % i == 0) {
      		System.out.println(i);
      	}
      }
   }
}