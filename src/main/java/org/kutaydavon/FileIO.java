package org.kutaydavon;
import java.io.*;
public class FileIO {


        public static void writeToFile(String data, String fileName) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            }
        }

        public static String readFromFile(String fileName) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append(System.lineSeparator());
                }
                return result.toString();
            }
        }
    }


