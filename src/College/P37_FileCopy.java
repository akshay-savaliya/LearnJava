package College;

import java.io.*;

public class P37_FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\HP\\OneDrive\\Desktop\\akshay\\source.txt";
        String targetFilePath = "C:\\Users\\HP\\OneDrive\\Desktop\\akshay\\target.txt";

        try (InputStream in = new FileInputStream(sourceFilePath);
             OutputStream out = new FileOutputStream(targetFilePath)) {
            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

