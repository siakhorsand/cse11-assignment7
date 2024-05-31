// DON'T FORGET TO ADHERE TO CSE11 STYLE GUIDELINES!

public abstract class FSComponent {
    private String name;

    /**
     * No-arg constructor.
     * DO NOT CHANGE!
     */
    protected FSComponent() {}

    /**
     * Public constructor that takes in a String.
     * DO NOT CHANGE!
     *
     * @param name the name of the FSComponent
     */
    protected FSComponent(String name) {
        this.name = name;
    }

    /**
     * Public getter that retrieves instance variable - name
     * DO NOT CHANGE!
     *
     * @return instance variable - name
     */
    public String getName() {
        return name;
    }

    /**
     * Public setter that mutates instance variable - name
     * DO NOT CHANGE!
     * @param name instance variable - name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
    }

    /* The following four abstract methods need
     * to be implemented by its subclasses.
     * DO NOT CHANGE! */
    public abstract void setParentDir(FSDirectory dir);
    public abstract boolean isFile();
    public abstract boolean isDirectory();
}
