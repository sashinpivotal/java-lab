package _09_strings;

//import org.apache.commons.lang3.StringUtils;

public class Playground {
    public static void main(String[] args) {
    }
}

/*
            TODO 1 Make yourself familiar with _5_string folder
            TODO 2 Check the conditionals package

            TODO 3 Extra task
             Use Apache StringUtils to change "John Doe" into "jOHN dOE"
*/

























/*
    1. Add the below Maven dependency to pom.xml

     <dependencies>
        <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.12.0</version>
        </dependency>
    </dependencies>

    2. Reload the Maven project
        Right-click pom.xml -> Maven -> Reload Project

    3. Use StringUtils

        String johnDoeBeforeSwap = "John Doe";
        System.out.println(johnDoeBeforeSwap);
        String johnDoeAfterSwap = StringUtils.swapCase(johnDoeBeforeSwap);
        System.out.println(johnDoeAfterSwap);
 */