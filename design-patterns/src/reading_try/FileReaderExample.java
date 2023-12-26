package reading_try;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        // Assuming the file is in the same package and named "example.txt"
        String fileName = "src/reading_try/places_us.tsv";
        int count = 1;
        int headerTabCount = 0;
        long l1 = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = reader.readLine();
            for (char c : line.toCharArray()) {
                if (c == '\t') headerTabCount++;
            }

            while ((line = reader.readLine()) != null && count != 1_00_00_000L) {
                int localTabCount = 0;
                for (char c : line.toCharArray()) {
                    if (c == '\t') localTabCount++;
                }
                if (localTabCount != headerTabCount) {
                    System.out.println("INCORRECT TAB COUNT LINE FOUND ");
                    System.out.println("Line Count " + count + " Breaking count is this " + localTabCount);
                    break;
                }
//                System.out.println(line);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis();

        System.out.println("Time Taken TO Read : " + (l2 - l1)/1000 +" Seconds ");
        System.out.println("Lines Read " + count);
    }
}
