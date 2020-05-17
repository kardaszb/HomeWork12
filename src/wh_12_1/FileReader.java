package wh_12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    static List<Integer> readFromFile(String fileName, List<Integer> readValuesFromFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            int intFromFile = scanner.nextInt();
            readValuesFromFile.add(intFromFile);
        }
        return readValuesFromFile;
    }
}
