import java.io.*;

public class CSVFileCopy {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String destinationFile = "students_copy.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
