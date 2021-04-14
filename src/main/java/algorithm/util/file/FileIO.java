package algorithm.util.file;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

import static algorithm.util.file.FileUtils.removeUsingNewFile;

public class FileIO {

    public static void main(String[] argv) {
        try {
            FileIO fileIO = new FileIO();
            File readFile = fileIO.fileChooser();
            String data = fileIO.readFile(readFile);
            System.out.println(data);
            File writeFile = fileIO.fileChooser();
            fileIO.writeFile(writeFile,
                    "123\n"
                            + "456\n"
                            + "789\n"
                            + "877");
            removeUsingNewFile(writeFile, "877");
        } catch (NullPointerException | IOException nullPointerException) {
            // Nothing just in test , but need to detect in use
        }
    }

    public File fileChooser() {
        File selectedFile = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Choose data file", "txt", "json", "je"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            System.out.println("選擇檔案" + selectedFile.getName());
        }
        return selectedFile;
    }

    public void writeFile(File writeFile, String writeData) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile));
        bufferedWriter.write(writeData);
        bufferedWriter.close();
    }

    public String readFile(File readFile) throws IOException {
        StringBuilder readDataStringBuilder = new StringBuilder();
        String temp;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(readFile));
        while ((temp = bufferedReader.readLine()) != null) {
            readDataStringBuilder.append(temp).append("\n\r");
        }
        bufferedReader.close();
        return readDataStringBuilder.toString();
    }

}
