package utilities;

import java.io.*;
import java.util.*;

public class CSV {

    // reading from file & taking info to place in new data structure
    public static List<String[]> read(String filePath) {
        List<String[]> data = new LinkedList<>();
        String lineOfData = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((lineOfData = reader.readLine()) != null) {
                String[] arrayOfData = lineOfData.split(",");
                data.add(arrayOfData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE CANNOT BE FOUND!!!");
        } catch (IOException e) {
            System.out.println("FILE CANNOT BE READ!!!");
        }
        return data;
    }

    // reads list of potential employees from fileToRead
    // adds new data structure to hold list of official employees based on dept criteria --> dept != none
    // writes list of official employees to fileToWrite
    public static List<String[]> readAndWrite(String readFromFilePath, String writeToFilePath) {
        List<String[]> data = new LinkedList<>();
        String line = "";
        try ( BufferedReader reader = new BufferedReader(new FileReader(readFromFilePath));
              BufferedWriter writer = new BufferedWriter(new FileWriter(writeToFilePath));
              ) {
            while((line = reader.readLine()) != null) {
                String[] arrayOfData = line.split(",");
                for (int i=2; i<arrayOfData.length; i++) {
                    if (!arrayOfData[i].equalsIgnoreCase("none")) {
                        writer.write(line + "\n");
                        data.add(arrayOfData);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE CANNOT BE FOUND!!!");
        } catch (IOException e) {
            System.out.println("FILE CANNOT BE READ!!!");
        }
        return data;
    }


}
