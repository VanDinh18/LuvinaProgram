package lvn_9_0808.btvn;

public class OrderDetail implements Comparable<OrderDetail>{
    private int idOrder;
    private int idDetail;
    private int itemID;
    private int amount;
    private float price;

    public OrderDetail(int idOrder, int idDetail, int itemID, int amount, float price) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "idOrder=" + idOrder +
                ", idDetail=" + idDetail +
                ", itemID=" + itemID +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(OrderDetail orderDetail) {
        if(this.idOrder - orderDetail.idOrder > 0){
            return 1;
        }
        else if(this.idOrder - orderDetail.idOrder < 0){
            return -1;
        }
        else {
            return 0;
        }
    }
}
