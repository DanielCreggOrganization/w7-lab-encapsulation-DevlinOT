package ie.atu.encapsulation;

public class SecretMessage {
    private String message; // Private field - cannot be accessed directly from outside
    
    //constructor
    public SecretMessage(String message) {
        this.message = message;
    }
    
    // display secret message
    public void displayMessage() {
        System.out.println("Secret Message: " + message);
    }
}
