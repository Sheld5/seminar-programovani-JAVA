public class Statistika {
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      double soucet = 0;
      double maximum = 0;
      double minimum = 0;
      int i = 0;
      double d = 0;
      double odchylka = 0;
      while (sc.hasNextDouble()) {
      	d = sc.nextDouble();
      	soucet += d;
      	if (i == 0) {
      		maximum = d;
      		minimum = d;
      	}
      	if (d > maximum) {
      		maximum = d;
      	}
      	if (d < minimum) {
      		minimum = d;
      	}
      	odchylka += d * d;
      	i++;
      }
      if (i == 0) {
            System.out.print("Nebyly zadany zadne hodnoty!");
      } else {
      	    double prumer = soucet / i;
      	    if (i == 1) {
      	    	odchylka = 0;
      	    } else {
      	    	odchylka = Math.sqrt((odchylka / i) - (prumer * prumer));
      	    }
            System.out.printf("Soucet je %2.2f.\n", soucet);
            System.out.printf("Maximum je %2.2f.\n", maximum);
            System.out.printf("Minimum je %2.2f.\n", minimum);
            System.out.printf("Prumer je %2.2f.\n", prumer);
            System.out.printf("Odchylka je %2.2f.\n", odchylka);
      }
   }
}
