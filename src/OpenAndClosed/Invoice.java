package OpenAndClosed;

// Here the DAO class is extended to implement saving in file
public class Invoice {

    int quantity;
    Pen pen;

    public Invoice(int quantity, Pen pen) {
        this.quantity = quantity;
        this.pen = pen;
    }

    public int calculateTotalPrice(){  //reason 1
        return this.quantity* pen.price;
    }

}
