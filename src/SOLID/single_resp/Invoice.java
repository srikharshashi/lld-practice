package SOLID.single_resp;
// Plain Invoice class
public class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int gettotal(){
        return marker.price * quantity;
    }
}


// so seperate out the functiionality of printing and DB Logic 

// A DAO (Data Access Object) class is a design pattern used to separate the data persistence logic from the business logic in an application. 
// It provides an abstract interface to some type of database or other persistence mechanism. 
// By using DAO, you can change the underlying database implementation without affecting the business logic.

class InvoiceDAO{
    private Invoice invoice;
    public InvoiceDAO(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){
        //save to DB
    }
}

// Printer class

class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    public void printInvoice(){
        //print invoice
    }
}

//Advnatges of Single Responsibility Principle
// 1. Easier to understand the code
// 2. Easier to test the code
// 3. Easier to maintain the code
// 4. Less coupling between classes