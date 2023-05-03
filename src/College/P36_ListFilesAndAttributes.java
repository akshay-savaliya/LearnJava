package College;

import java.io.File;

public class P36_ListFilesAndAttributes {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\HP\\OneDrive\\Desktop\\akshay"); // replace with your directory path
        File[] files = directory.listFiles();

        for (File file : files) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Length: " + file.length() + " bytes");
            System.out.println();
        }
    }
}

