///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               FSFile.java
// Quarter:            Spring 2024
//
// Author`s Name:      Sia Khorsand 
// Professor:          Dr. Ochoa

import java.util.ArrayList;

/*
 * FSFile class represents a file in the file system.
 * 
 * Bugs: none 
 * 
 * @author Sia Khorsand
 */

public abstract class FSFile extends FSComponent  {

    private FSDirectory parentDir;

    // Constructors 
    protected FSFile() {
        super("FSFile");
    }

    protected FSFile(String name) {
        super(name);
    }

    // Methods
    
    @Override
    public boolean isFile() {
        return true;
    }
    @Override
    public boolean isDirectory() {
        return false;
    }

    /**
     * Public getter that retrieves instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @return instance variable - parentDir
     */
    public FSDirectory getParentDir() {
        return this.parentDir;
    }

    /**
     * Public setter that mutates instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @param parentDir instance variable - parentDir
     */
    public void setParentDir(FSDirectory parentDir) {
        this.parentDir = parentDir;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FSFile){
            FSFile other = (FSFile) obj;
            return super.equals(other) && ((this.parentDir.equals(other.parentDir) || (this.parentDir != null) && this.parentDir.equals(other.parentDir)));
        } else {
            return false;
        }
    }

    public abstract void outputFileContents(String outputFileName) throws Exception;


}
