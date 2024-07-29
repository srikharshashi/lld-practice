package SOLID.open_close;

// Open Close Princlple
// A class should be open for extension but closed for modification

// import mock invoice class
import SOLID.single_resp.Invoice;
//Existing Class
class InvoiceDAO{
    private Invoice invoice;
    public InvoiceDAO(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){
        //save to DB
    }
}

// Let us say user also wants to save the invoice to a file
// Assume this class is also live in prod and tested well as well 
// Then Open Close Principle says that we should NOT modify this class
// Instead we should extend this class and add the new functionality

class InvoiceFileDAO extends InvoiceDAO{
    public InvoiceFileDAO(Invoice invoice){
        super(invoice);
    }
    public void saveToFile(){
        //save to file
    }
}
