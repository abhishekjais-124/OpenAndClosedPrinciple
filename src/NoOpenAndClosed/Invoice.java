package NoOpenAndClosed;

// I need to add one more functionality for saving to file, but I modified the DAO class instead of its extension. It can create issue in
// already running code on prod.

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
