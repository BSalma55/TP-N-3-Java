import java.io.File;
import java.util.Scanner;
public class Simulates {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the full directory path: ");
            String path = scanner.nextLine();
            File directory = new File(path);
            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("Invalid path or not a directory.");
                return;
            }

            File[] files = directory.listFiles();

            if (files != null) {
                for (File f : files) {

                    String type = f.isDirectory() ? "<DIR>" : "<FILE>";
                    
                    String r = f.canRead() ? "r" : "-";
                    String w = f.canWrite() ? "w" : "-";
                    String h = f.isHidden() ? "h" : "-";

                    // Display result
                    System.out.println(
                            f.getPath() + " " + type + " " + r + w + h
                    );
                }
            }

            scanner.close();
        }
    }


