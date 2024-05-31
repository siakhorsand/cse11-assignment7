///////////////////////////////////////////////////////////////////////////////
//          
// Main Class File:    Assignment7.java
// File:               HumanReadableFile.java
// Quarter:            Spring 2024
//
// Author`s Name:      Sia Khorsand 
// Professor:          Dr. Ochoa

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * HumanReadableFile class represents a file in the file system that can be read.
 * 
 * Bugs: none 
 * 
 * @author Sia Khorsand
 */


public class HumanReadableFile extends FSFile {
    private String content;

    // Constructors
    protected HumanReadableFile() {
        super("HumanReadableFile");
    }

    protected HumanReadableFile(String name) {
        super(name);
    }

    // Methods
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setParentDir(FSDirectory dir) {
        this.setParentDir(dir);
    }

    @Override
    public boolean isFile() {
        return true;
    }

    public void outputContent(String outputFileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            writer.println(this.content);
        }
    }

    public void readContent(String inputFileName) throws IOException {
        this.content = Files.readString(Paths.get(inputFileName));
    }