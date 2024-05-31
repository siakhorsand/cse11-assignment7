// DON'T FORGET TO ADHERE TO CSE11 STYLE GUIDELINES!

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class FSDirectory extends FSComponent {

    private ArrayList<FSComponent> componentList;

    /**
     * No-arg constructor.
     * DO NOT CHANGE!
     */
    protected FSDirectory() {
        super("FSDirectory");
    }

    protected FSDirectory(String name) {
    }

    public boolean isFile() {
    }

    public boolean isDirectory() {
    }

    /**
     * Public getter that retrieves instance variable - componentList.
     * DO NOT CHANGE!
     *
     * @return the componentList instance variable
     */
    public ArrayList<FSComponent> getComponentList() {
        return this.componentList;
    }

    /**
     * Public setter that mutate instance variable - componentList.
     * DO NOT CHANGE!
     * @param componentList the new componentList variable to be assigned
     */
    public void setComponentList(ArrayList<FSComponent> componentList) {
        this.componentList = componentList;
    }

    /**
     * Add a component to the end of the componentList.
     * DO NOT CHANGE!
     *
     * @param newComp the new component to be appended
     */
    public void appendComponent(FSComponent newComp) {
        this.componentList.add(newComp);
        newComp.setParentDir(this);
    }

    public boolean addComponent(FSComponent newComp) {
    }

    public void outputComponentNames(String outputFileName) throws Exception {
    }

    // STUDENTS NEED TO IMPLEMENT THIS.
    @Override
    public boolean equals(Object obj) {
    }
}
