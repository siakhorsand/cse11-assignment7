///////////////////////////////////////////////////////////////////////////////
//          
// Main Class File:    Assignment7.java
// File:               ArchiveFile.java
// Quarter:            Spring 2024
//
// Author`s Name:      Sia Khorsand 
// Professor:          Dr. Ochoa


import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;


/*
 * The ArchiveFile class extends the FSFile abstract class
 * 
 * Bugs : none
 * 
 * @author Sia Khorsand
 *
 * 
    */

public class ArchiveFile extends FSFile {
    private FSComponent[] componentArray;


    // Constructors

    public ArchiveFile(){} 

    public ArchiveFile(String name, FSComponent[] componentArray){
        super(name.endWith(".zip") ? name : name + ".zip");
        this.componentArray = componentArray != null ? Arrays.copyOf(componentArray, componentArray.length) : null;

    }

    @Override 
    public void outputFileContents(String outputFileName) throws Exception {
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            for (FSComponent component : componentArray) {
                writer.println(component.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override 
    public boolean equals(Object obj) {
        if (obj instanceof ArchiveFile) {
            ArchiveFile other = (ArchiveFile) obj;
            return super.equals(other) && Arrays.equals(this.componentArray, other.componentArray);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ArchiveFile: " + super.getName();
    }

}