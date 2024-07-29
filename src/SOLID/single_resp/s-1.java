package SOLID.single_resp;
//Single Reposnsibility Principle
//A class should have only one reason to change 
// OR Only one responsibility

class Marker{
    String name;
    String color;
    int year;
    int price;
    public Marker(String name,String color,int year,int price){
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;
    }
}


// class Invoice{
//     private Marker marker;
//     private int quantity;

//     public Invoice(Marker marker,int quantity){
//         this.marker=marker;
//         this.quantity=quantity;
//     }

    // public int gettotal(){
    //     return marker.price * quantity;
    // }

//     public void printInvoice(){
//         //print invoice
//     }

//     public void saveToDB(){
//         //print invoice
//     }
// }

// The above class does not follow single responsibilty princple 
// It handles printing logic as well as DB storage logic 
// Class does not have to do this 
// The class also has to be modified if tax is introduced --> This is acceptable 

