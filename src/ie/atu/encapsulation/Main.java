package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {
        
        //create secret message object
        SecretMessage secretMessage = new SecretMessage("My secret message");
        Temperature temperature = new Temperature();
        Grade grade = new Grade("John Doe", "CS101", 85);
        Book book = new Book("Harry Potter", "JK rowling", "123456789");
        

        secretMessage.displayMessage();
        System.out.println("Temperature in Celsius: " + temperature.getCelcius());
        System.out.println("Temperature in Fahrenheit: " + temperature.getFah());
        System.out.println(grade.displayGradeInfo());
        System.out.println(book.displayBookInfo());

        
    }
}


