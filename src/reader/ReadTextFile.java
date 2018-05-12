package reader;

import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Google Drive\\PIIT\\IntellijCodes\\Intellij\\class notes.txt");

        BufferedReader br = null;
        br = new BufferedReader(fileReader);

        try {
            String st = "";
            while (((st = (br.readLine())) != null)) {
                System.out.println(st);
            }
        } catch (Exception e) {
            System.out.println("File Not Found. Check your path");
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
