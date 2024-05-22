package chatbot;

import java.util.Scanner;

public class MagpieDriver{
/**
 * Create a Magpie, give it user input, and print its replies.
     * @param args
 */
    public static void main(String[] args) {
        // for formatting output
        String startMessage = "****************************  START  *******************************\n";
        String endMessage = "\n****************************   END   *******************************\n";
        System.out.println(startMessage);

        // create an instance of the Chatbot
        Magpie maggie = new Magpie();
        // print the Chatbot's welcome message
        System.out.println(maggie.getGreeting());
        // create a Scanner instance for user input
        Scanner in = new Scanner(System.in);
        // read the user input
        String statement = in.nextLine();

        // set the chatbot to respond to user input 
        // as long as the user does not input the word bye
        while (!statement.equalsIgnoreCase("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
        // print closing messages
        System.out.println("Goodbye!");
        System.out.println(endMessage);

    }
}

// Response when entering "no": "Why so negative?"
// Response when entering "mother": "Tell me more about your mother."
// Response when entering nothing: There are 4 possible returns; "Hmmm.", "You don't say.", "Do you really think so?", "Interesting tell me more."
/* The reason that words like "another" and phrases like "I know all the state capitals" and "I like vegetables smothered in cheese" return statements like 
 * "Why so negative?" and "Tell me more about your mother" is because it found the word that it is indexing for, inside another word, for example with
 * "I know all the state capitals" the word "no" was found inside the word "know" and the word mother was found inside "smothered"
 */
