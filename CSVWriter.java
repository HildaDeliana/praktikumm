import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan data mahasiswa (format: NIM,Nama,Umur,Prodi):");
        String data = scanner.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
