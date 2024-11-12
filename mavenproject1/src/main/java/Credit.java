/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charan
 */
public class Credit extends Payment {
    private String name;
    private String type;
    private String expDate;

    public Credit(float amount, String name, String type, String expDate) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }
}
