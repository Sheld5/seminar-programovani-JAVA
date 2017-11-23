public class KvadratickaRovnice {
   public static void main(String[] args) {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double c = Double.parseDouble(args[2]);
      double d = (b * b) - (4 * a * c);
      if ((-0.00001 < d) && (d < 0.00001)) {
        double x = -b / (2 * a);
        System.out.print(x);
      } else if (d < -0.00001) {
        System.out.print("nema reseni");
      } else {
        double x = (-b + Math.sqrt(d)) / (2 * a);
        double y = (-b - Math.sqrt(d)) / (2 * a);
        System.out.print(x + " " + y);
      }
   }
}