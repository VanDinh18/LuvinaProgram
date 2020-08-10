package lvn_9_0808.btvn;

import java.util.Date;

public class Order implements Comparable<Order>{
    private int idOrder;
    private Date ordDate;
    private String customerID;

    public Order(int idOrder, Date ordDate, String customerID) {
        this.idOrder = idOrder;
        this.ordDate = ordDate;
        this.customerID = customerID;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public int compareTo(Order order) {
        if(this.customerID.compareTo(order.customerID) == 0){
            if(this.idOrder > order.idOrder){
                return 1;
            }
            else if(this.idOrder < order.idOrder){
                return -1;
            }
            else {
                return 0;
            }
        }
        else {
            return this.customerID.compareTo(order.customerID);
        }
    }

    @Override
    public String toString() {
        return "Order { " +
                "idOrder=" + idOrder +
                ", ordDate=" + ordDate +
                ", customerID='" + customerID + '\'' +
                " } ";
    }
}
