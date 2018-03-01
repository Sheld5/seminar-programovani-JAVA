import java.io.File;
 
public class Stromecek {
	public static void main(String[] args) {
		printFiles(new File(".."), "");
	}

	private static void printFiles(File dir, String indent) {
		File[] files = dir.listFiles();
		int count = 0;
		for (File f : files) {
			count ++;
			if (count == files.length) {
				System.out.printf("%s'-- %s\n", indent, f.getName());
			} else {
				System.out.printf("%s|-- %s\n", indent, f.getName());
			}
			if (f.isDirectory()) {
				if (count == files.length) {
					printFiles(f, indent + "     ");
				} else {
					printFiles(f, indent + "|    ");
				}
			}
		}
	}
}