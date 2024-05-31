// DON'T FORGET TO ADHERE TO CSE11 STYLE GUIDELINES!

public class Assignment7 {
    /**
     * A tester for the file system.
     *
     * @return return true if the tester passes
     */
    private static boolean testOne() {
        RootDirectory root = new RootDirectory("Home");
        HumanReadableFile pic = new HumanReadableFile("cat.png",
                                                      "contents of picture");
        HumanReadableFile rice = new HumanReadableFile("rice.mp3",
                                                      "contents of mp3 file");
        SubDirectory music = new SubDirectory("music");
        root.addComponent(pic);
        root.addComponent(rice);
        root.addComponent(music);

        if (!root.getName().equals("Home")) return false;
        if (!pic.getName().equals("cat.png")) return false;
        if (!rice.getName().equals("rice.mp3")) return false;
        if (!music.getName().equals("music")) return false;

        System.out.println();
        return true;
    }


    // TODO: ADD MORE TESTER METHODS.

    // Suggestion: you should test adding components in directories,
    // reading/writing contents from a file into, a randomization of the
    // instance methods

    /**
     * All unit tests. This method should be executed to ensure that all
     * methods are correctly implemented.
     *
     * @return true if all unit tests passed, false otherwise.
     */
    public static boolean unitTests() {
        if (!testOne()) {
            return false;
        }

        // TODO call your test methods here!

        return true;
    }

    /**
     * The main method, where program execution begins.
     *
     * @param args Any command-line arguments.
     */
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
        }
        // Don't need to write code here!
    }
}
