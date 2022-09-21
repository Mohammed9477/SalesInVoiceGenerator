package SalesVoiceGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class fileClass {
    //class for file operations
    private ArrayList<InvoiceClass> invoices;
    //private ArrayList<linesClass> lines;
    public fileClass(){
        invoices = new ArrayList<>();
        //lines = new ArrayList<>();
    }
    public ArrayList<InvoiceClass> read() throws IOException {
        JFileChooser fc = new JFileChooser();
        try {
            JOptionPane.showMessageDialog(null, "Select Invoice Header File",
                    "Invoice Header", JOptionPane.INFORMATION_MESSAGE);
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                Path headerPath = Paths.get(headerFile.getAbsolutePath());
                List<String> headerLines = Files.readAllLines(headerPath);
                System.out.println("Invoices have been read");
                // 1,22-11-2020,Ali
                // 2,13-10-2021,Saleh
                // 3,09-01-2019,Ibrahim
                ArrayList<InvoiceClass> invoicesArray = new ArrayList<>();
                for (String headerLine : headerLines) {
                    try {
                        String[] headerParts = headerLine.split(",");
                        int invoiceNum = Integer.parseInt(headerParts[0]);
                        String invoiceDate = headerParts[1];
                        String customerName = headerParts[2];

                        InvoiceClass invoice = new InvoiceClass(invoiceNum, invoiceDate, customerName);
                        invoicesArray.add(invoice);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error in line format", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                System.out.println("Check point");
                JOptionPane.showMessageDialog(null, "Select Invoice Line File",
                        "Invoice Line", JOptionPane.INFORMATION_MESSAGE);
                result = fc.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    Path linePath = Paths.get(lineFile.getAbsolutePath());
                    List<String> lineLines = Files.readAllLines(linePath);
                    System.out.println("Lines have been read");
                    // 1,1,2,3
                    // 2,2,3,4
                    // 3,3,4,5
                    for (String lineLine : lineLines) {
                        try {
                            String[] lineParts = lineLine.split(",");
                            int invoiceNum = Integer.parseInt(lineParts[0]);
                            int lineNum = Integer.parseInt(lineParts[1]);
                            int quantity = Integer.parseInt(lineParts[2]);
                            double price = Double.parseDouble(lineParts[3]);
                            for (InvoiceClass invoice : invoicesArray) {
                                if (invoice.getInvoiceN() == invoiceNum) {
                                    linesClass line;

                                }


                            }
                        } catch (NumberFormatException e) {
                            throw new RuntimeException(e);
                        }
                    } }}}catch (Exception ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error in line format", "Error", JOptionPane.ERROR_MESSAGE);

                        } return invoices;
    }
}