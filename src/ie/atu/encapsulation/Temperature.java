package ie.atu.encapsulation;

public class Temperature {
    private double celcius;
    
    // Getter method
    public double getCelcius() {
        return celcius;
    }
    
    // Setter method
    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getFah() {
        return (celcius * 9/5) + 32;
    }
}
