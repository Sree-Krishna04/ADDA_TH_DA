/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charan
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Order {
    private Date date;
    private String status;
    private List<OrderDetail> orderDetails = new ArrayList<>();

    // Constructor
    public Order(Date date, String status) {
        this.date = date;
        this.status = status;
    }

    public float calcSubTotal() {
        // Calculate subtotal based on order details
        float subtotal = 0;
        for (OrderDetail detail : orderDetails) {
            subtotal += detail.calcSubTotal();
        }
        return subtotal;
    }

    public float calcTax() {
        // Calculate tax based on order details
        float tax = 0;
        for (OrderDetail detail : orderDetails) {
            tax += detail.calcTax();
        }
        return tax;
    }

    public float calcTotal() {
        return calcSubTotal() + calcTax();
    }

    public float calcTotalWeight() {
        float totalWeight = 0;
        for (OrderDetail detail : orderDetails) {
            totalWeight += detail.calcWeight();
        }
        return totalWeight;
    }

    // Adding an OrderDetail
    public void addOrderDetail(OrderDetail detail) {
        orderDetails.add(detail);
    }
}