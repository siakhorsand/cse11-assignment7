///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               FSDirectory.java
// Quarter:            Spring 2024
//
// Author`s Name:      Sia Khorsand 
// Professor:          Dr. Ochoa
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * SubDirectory represents a sub-directory in this file system.
 *
 * Bugs: None 
 *
 * @author Sia Khorsand
 
 */

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
        super(name);
        this.componentList = new ArrayList<>();
    }

    public boolean isFile() {
        return false;
    }

    public boolean isDirectory() {
        return true;
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
        for (FSComponent comp : componentList){
            if (comp.getName().equals(newComp.getName())){
                return false;
            }
        }
        appendComponent(newComp);
        newComp.setParentDir(this);
        return true;
        
    }

    public void outputComponentNames(String outputFileName) throws Exception {
        if (componentList == null || componentList.isEmpty()) {
            throw new Exception("Empty directory contents!");
        } 
        try (PrintWriter writer = new PrintWriter(outputFileName)){
            for (FSComponent comp : componentList){
                writer.println(comp.getName());
            }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // STUDENTS NEED TO IMPLEMENT THIS.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FSDirectory){
            FSDirectory other = (FSDirectory) obj;
            return super.equals(other) && this.componentList.equals(other.componentList);
        } else {
            return false;
        }
    }
}
