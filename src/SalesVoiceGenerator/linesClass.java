package SalesVoiceGenerator;
import java.util.*;
public class linesClass {
    // class for invoice lines
    private String item;
    private double Price;
    private int Count;
    private InvoiceClass invoice;
    //constructor
    public linesClass() {
    }
    //constructor with parameters
    public linesClass(String item, double Price, int Count, InvoiceClass invoice) {
        this.item = item;
        this.Price = Price;
        this.Count = Count;
        this.invoice = invoice;
    }
    //get line total
    public double getLineTotal() {
        return Price * Count;
    }
    //get item
    public String getItem() {
        return item;
    }
    //set item
    public void setItem(String item) {
        this.item = item;
    }
    //get price
    public double getPrice() {
        return Price;
    }
    //set price
    public void setPrice(double Price) {
        this.Price = Price;
    }
    //get count
    public int getCount() {
        return Count;
    }
    //set count
    public void setCount(int Count) {
        this.Count = Count;
    }
    //toString method
    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getInvoiceN() + ", item=" + item + ", price=" + Price + ", count=" + Count + '}';
    }
    //get invoice
    public InvoiceClass getInvoice() {
        return invoice;
    }
    //get as CSV
    public String getCSV() {
        return invoice.getInvoiceN() + "," + item + "," + Price + "," + Count;
    }
}
