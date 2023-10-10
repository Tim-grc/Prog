package fr.troisil.info.java.funcprog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

    public static String getResourcePath(String fileName) {
        File file = new File("");
        String filePath = file.getAbsolutePath() + File.separator + fileName;
        return filePath;
    }

    public static File getResource(String fileName) {
        String completeFileName = getResourcePath(fileName);
        File file = new File(completeFileName);
        return file;
    }

    public static List<String> readFile(File file) throws IOException {

        List<String> result = new ArrayList<String>();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            result.add(line);
        }

        br.close();
        fr.close();

        return result;
    }
}
