import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class Rovnice {
	public static void main(String[] args) {
		int s = Integer.parseInt(args[0]);

		if (s == 0) {
			QuadraticEquationPrinter printer = new ScreenPrinter();
		} else if (s == 1) {
			// QuadraticEquationPrinter printer = new HtmlPrinter();
		}

		QuadraticEquationGenerator.generate(10, printer);
	}
}