/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saqib Khan
 */
public class PenWithoutCohesion {
    
    private String color;
    private String brand;

    // Constructor: Initializes the pen's color and brand
    public PenWithoutCohesion(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    // Method: Write with the pen
    public void write(String text) {
        System.out.println("Writing with the " + color + " pen: " + text);
    }

    // Method: Get information about the pen
    public String getPenInfo() {
        return "Pen color: " + color + ", Brand: " + brand;
    }

    // Unrelated method: Send an email (not related to pens)
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    // Main method to test the PenWithoutCohesion class
    public static void main(String[] args) {
        // Create a PenWithoutCohesion object
        PenWithoutCohesion myPen = new PenWithoutCohesion("Red", "Pilot");

        // Use the pen to write
        myPen.write("Java is fun!");

        // Get and display pen information
        String penInfo = myPen.getPenInfo();
        System.out.println(penInfo);

        // Unrelated task: Send an email
        myPen.sendEmail("example@example.com", "This is a test email.");
    }
}

    
    

