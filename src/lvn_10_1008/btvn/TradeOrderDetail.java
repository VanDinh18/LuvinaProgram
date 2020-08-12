package lvn_10_1008.btvn;

public class TradeOrderDetail {
    private Integer OrderID;
    private Integer Amount;
    private Float Price;

    public TradeOrderDetail(Integer orderID, Integer amount, Float price) {
        OrderID = orderID;
        Amount = amount;
        Price = price;
    }

    public Integer getOrderID() {
        return OrderID;
    }

    public Integer getAmount() {
        return Amount;
    }

    public Float getPrice() {
        return Price;
    }
}
