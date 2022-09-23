import java.util.Scanner;

/**
 * simple i/o project using scanner
 * @version 9.23.22
 * @author PSwigart
 */

public class HolyGrail {
    /**
     * main method of class HolyGrail
     * @param args command line arguments if needed
     */
    public static void main(String[] args) {
        // declaring local variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);

        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        // getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();

        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        // summary of user input
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is " + color);

    }
}
