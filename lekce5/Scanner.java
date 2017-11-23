public class Scanner {
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      double suma = 0.;
      while (sc.hasNextDouble()) {
      	double d = sc.nextDouble();
      	suma += d;
      }
      System.out.print("Soucet je " + suma);
   }
}