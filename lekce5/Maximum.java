public class Maximum {
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      double x = 0.;
      int i = 0;
      while (sc.hasNextDouble()) {
      	if (i == 0) {
      		x = sc.nextDouble();
      	}
      	if (sc.nextDouble() > x) {
      		x = sc.nextDouble();
      	}
      	i++;
      }
      System.out.print(x);
   }
}