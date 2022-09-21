package SalesVoiceGenerator;
//import java.util.*;
import java.util.*;

public class InvoiceClass {
    //create a class for invoice
    private int invoiceN;
    private String invoiceDate;
    private String enivoiceCustName;

    private ArrayList<linesClass> invoiceLines;

    public InvoiceClass() {
    }
    //create a constructor for invoice
    public InvoiceClass(int invoiceN, String invoiceDate, String enivoiceCustName) {
        this.invoiceN = invoiceN;
        this.invoiceDate = invoiceDate;
        this.enivoiceCustName = enivoiceCustName;
    }
    //create a method to get invoice number
    public int getInvoiceN() {
        return invoiceN;
    }
    //create a method to set invoice number
    public void setInvoiceN(int invoiceN) {
        this.invoiceN = invoiceN;
    }
    //create a method to get invoice date
    public String getInvoiceDate() {
        return invoiceDate;
    }
    //create a method to set invoice date
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    //create a method to get customer name
    public String getEnivoiceCustName() {
        return enivoiceCustName;
    }
    //create a method to set customer name
    public void setEnivoiceCustName(String enivoiceCustName) {
        this.enivoiceCustName = enivoiceCustName;
    }
    //create a method to get invoice lines
    public ArrayList<linesClass> getInvoiceLines() {
        return invoiceLines;
    }
    //create a method to set invoice lines
    public void setInvoiceLines(ArrayList<linesClass> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
    //create a method to get invoice total
    public double getInvoiceAll() {
        double total = 0.0;
        for (linesClass line : getInvoiceLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    // toString method
    @Override
    public String toString() {
        return "Invoice{" + "invoiceN=" + invoiceN + ", invoiceDate=" + invoiceDate + ", enivoiceCustName=" + enivoiceCustName + '}';
    }
    //get invoice as CSV
    public String getCSV() {
        return invoiceN + "," + invoiceDate + "," + enivoiceCustName;
    }

}
