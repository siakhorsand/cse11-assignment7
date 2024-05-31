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

/*
 * HumanReadableFile class represents a file in the file system that can be read.
 * 
 * Bugs: none 
 * 
 * @author Sia Khorsand
 */


public class HumanReadableFile extends FSFile {
    private String contents;

    // Constructors
    protected HumanReadableFile() {} 

    protected HumanReadableFile(String name, String contents) {
        super(name);
        this.contents = contents;
    }

    // Methods
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override 
    public void outputFileContents(String outputFileName) throws Exception {
        if (contents == null || contents.isEmpty()) {
            throw new Exception("Empty file contents!");
        }
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            writer.println(this.contents);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HumanReadableFile) {
                HumanReadableFile other = (HumanReadableFile) obj;
                return super.equals(other) && ((this.contents == null && other.contents == null) || (this.contents != null && this.contents.equals(other.contents)));
            } else {
                return false;
            }
        }
        @Override
        public String toString() {
            return "HumanReadableFile: " + this.getName();
        }
    } 
