// DON'T FORGET TO ADHERE TO CSE11 STYLE GUIDELINES!

import java.util.ArrayList;

public abstract class FSFile extends FSComponent  {

    private FSDirectory parentDir;

    /**
     * No-arg constructor.
     * DO NOT CHANGE!
     */
    protected FSFile() {
        super("FSFile");
    }

    protected FSFile(String name) {
    }

    public boolean isFile() {
    }

    public boolean isDirectory() {
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
    }

}
