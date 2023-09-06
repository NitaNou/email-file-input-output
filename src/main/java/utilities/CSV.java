package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSV {

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


}
