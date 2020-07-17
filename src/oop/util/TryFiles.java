package oop.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TryFiles {

    private List<String> readTextLines() throws IOException {
        Path path = Paths.get("./database/example.txt");
        List<String> fileLines = Files.readAllLines(path);
        return fileLines;
    }

    public static void main(String[] args) throws IOException {
        TryFiles tryFiles = new TryFiles();

        List<String> textLines = tryFiles.readTextLines();
        for (String textLine : textLines) {
            System.out.println(textLine);
        }

    }

}
