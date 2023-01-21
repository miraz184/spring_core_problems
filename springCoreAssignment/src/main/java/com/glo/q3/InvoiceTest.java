package com.glo.q3;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("111", "Hammer", 2, 123.99);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
