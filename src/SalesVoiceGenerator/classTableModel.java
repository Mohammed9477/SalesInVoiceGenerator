package SalesVoiceGenerator;
//import java.util.*;
import javax.swing.table.AbstractTableModel;
import java.util.*;
public class classTableModel extends AbstractTableModel {
    // class for table model
    private ArrayList<linesClass> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    public classTableModel(ArrayList<linesClass> invoices) {
        this.invoices = invoices;
    }
    public int getRowCount() {
        return invoices.size();
    }

    public int getColumnCount() {
        return columns.length;
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       // InvoiceClass invoice = invoices.get(rowIndex);
        InvoiceClass invoice = invoices.get(rowIndex).getInvoice();

        switch (columnIndex) {
            case 0: return invoice.getInvoiceN();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getEnivoiceCustName();
            case 3: return invoice.getInvoiceAll();
            default : return "";
        }
    }

}
