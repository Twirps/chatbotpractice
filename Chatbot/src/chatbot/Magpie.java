package chatbot;

public class Magpie {
    
    /**
     * A default constructor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     * @return 
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * @param statement
     * @return 
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.contains("mother") == true) {
            response = "Tell me more about your mother.";
        }
        else if (statement.contains("no") == true) {
            response = "Why so negative?";
        } 
        else if (statement.contains("father") == true) {
            response = "Tell me more about your father";
        }
        else if (statement.contains("yes") == true) {
            response = "Why so positive?";
        }
        else if (statement.contains("Mordor") == true) {
            response = "Sauron?";
        }
        else if (statement.contains("wiktor") == true) {
            response = "She sounds like a good teacher";
        }
        else if (statement.equals("") == true) {
            response = "Say something please";
        }
        else {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4) {
            response = "That is very interesting.";
        }
        if (whichResponse == 5) {
            response = "Can you expand on this topic?";
        }

        return response;
    }
}

// Constructors : 1
// Fields: 5
// Methods: 3
// What does getGreeting() return: "Hello, let's talk."
// When more than one keyword appears in the response, the response is always the last if statemnet out of the keywords
// For the input "My mother has a dog but no cat" my response was the about the mother and not the negative one
