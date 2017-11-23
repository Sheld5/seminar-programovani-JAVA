public class Nasobilka {
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
      	for (int o = 1; o <= 10; o++) {
      		if (i * o < 10) {
      		   System.out.print(" ");
      		}
      		System.out.print(i * o + " ");
      	}
      	System.out.printf("\r\n");
      }
   }
}