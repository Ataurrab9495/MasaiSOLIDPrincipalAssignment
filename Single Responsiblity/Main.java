/* Single Responsibility Principle (SRP) */
public class Main{
    public static void main(String[] args){
        Invoice invoice = new Invoice(1111111, 500);
        InvoicePrinter inv = new InvoicePrinter();
        InvoiceDatabase invd = new InvoiceDatabase();
        inv.printInvoice(invoice);
        invd.saveToDatabase(invoice);
    }
} 


/* class Invoice {
    private int invoiceNumber;
    private double amount;

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public void printInvoice() {
        // Code to print the invoice
    }

    public void saveToDatabase() {
        // Code to save the invoice to the database
    }
} */




/* Removed the function print invoice and save to database method just to avoid the confliction of Single Resposibility principal */

class Invoice {
    private int invoiceNumber;
    private double amount;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }
}

class InvoicePrinter{
    public void printInvoice(Invoice invoice) {
        // Code to print the invoice
        System.out.println(invoice.getInvoiceNumber());
    }
}

class InvoiceDatabase{
    public void saveToDatabase(Invoice invoice) {
        // Code to save the invoice to the database
        System.out.println(invoice.getAmount());
    }
}
