/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charan
 */
public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;

    // Constructor
    public OrderDetail(int quantity, String taxStatus, Item item) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
        this.item = item;
    }

    public float calcSubTotal() {
        return item.getPriceForQuantity(quantity);
    }

    public float calcWeight() {
        return item.getShippingWeight() * quantity;
    }

    public float calcTax() {
        return item.getTax() * quantity;
    }
}
