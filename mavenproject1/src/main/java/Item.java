/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charan
 */
public class Item {
    private float shippingWeight;
    private String description;

    // Constructor
    public Item(float shippingWeight, String description) {
        this.shippingWeight = shippingWeight;
        this.description = description;
    }

    public float getPriceForQuantity(int quantity) {
        // Calculate price based on quantity
        return 10.0f * quantity; // Example pricing
    }

    public float getTax() {
        return 1.0f; // Example tax calculation
    }

    public boolean inStock() {
        // Check if item is in stock
        return true;
    }

    public float getShippingWeight() {
        return shippingWeight;
    }
}
