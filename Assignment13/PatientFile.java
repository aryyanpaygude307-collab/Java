import java.io.*;

public class PatientFile {
    public static void main(String[] args) {

        try {
            // Writing patient details to the file
            FileWriter fw = new FileWriter("patient.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Patient ID: 201");
            bw.newLine();
            bw.write("Name: Rahul");
            bw.newLine();
            bw.write("Age: 25");
            bw.newLine();
            bw.write("Diagnosis: Fever");
            bw.newLine();

            bw.close();

            System.out.println("Patient details written to file successfully.");
            System.out.println();

            // Reading patient details from the file
            FileReader fr = new FileReader("patient.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Patient Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}