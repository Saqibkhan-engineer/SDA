/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saqib Khan
 */
public class Pen {
    
    private String color;
    private String brand;

   
    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

   
    public void write(String text) {
        System.out.println("Writing with the " + color + " pen: " + text);
    }

   
    public String getPenInfo() {
        return "Pen color: " + color + ", Brand: " + brand;
    }
     public static void main(String[] args) {
        // Create a Pen object
        Pen myPen = new Pen("Blue", "Parker");

        // Use the pen to write
        myPen.write("Hello, world!");

        // Get and display pen information
        String penInfo = myPen.getPenInfo();
        System.out.println(penInfo);
    }
}

    

