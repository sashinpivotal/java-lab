package _01_java_intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my first Java program");

        // TODO-java-intro-01
        // - Open terminal window: either GitBash or
        //   terminal window within the IntelliJ
        // - Type "java -version"

        // TODO-IDE-01: shortcut keys for running an app
        // - Run this app using shortcut key "CTRL+SHIFT+F10" (for Windows VM)
        // - Rerun the app using shortcut key "SHIFT+F10" thereafter (for Windows VM)
        // - For useful shortcut keys, see https://github.com/sashinpivotal/java-tips

        // TODO-IDE-02: context-sensitive Javadoc
        // You are going to configure IntelliJ so that
        // you can display Javadoc of all JDK classes.
        // - Download and unzip JDK 11 javadoc zip file
        //   from https://www.oracle.com/java/technologies/javase-jdk11-doc-downloads.html
        // - Configure JDK documentation to your IntelliJ
        //   so that you can display Javadoc of a class
        //   in a context-sensitive fashion:
        //   - Select File -> Project Structure
        //   - Select Platform Settings -> SDKs -> 11 -> Documentation Paths
        //   - Click + sign and add ./docs/api of
        //     downloaded and unzipped path
        // - If you want to display Javadoc of "System"
        //   class in a context sensitive fashion, do
        //   the following:
        //   - move your cursor to "System" and press
        //     SHIFT+F1 and you will see the Javadoc
        //     of "System" class gets displayed in the
        //     default browser of your system
        //   (Instructor will demonstrate how it is done.)
        System.out.println("This is another line in the program");

        // TODO-IDE-03: TODO's in IntelliJ
        // - Click "TO DO" at the bottom of the IntelliJ
        //   to display all exercise tasks to be performed
        //   (Instructor will demonstrate how it is done.)
    }
}
