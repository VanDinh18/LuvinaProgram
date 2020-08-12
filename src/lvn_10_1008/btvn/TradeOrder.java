package lvn_10_1008.btvn;

import java.util.Date;

public class TradeOrder {// Hoá đơn mua, bán cổ phiểu
    private Integer OrderID;
    private String StockCode;
    private String SellerID;
    private String BuyerID;
    private Date date;

    public TradeOrder(Integer orderID, String stockCode, String sellerID, String buyerID, Date date) {
        OrderID = orderID;
        StockCode = stockCode;
        SellerID = sellerID;
        BuyerID = buyerID;
        this.date = date;
    }

    public Integer getOrderID() {
        return OrderID;
    }

    public String getStockCode() {
        return StockCode;
    }

    public String getSellerID() {
        return SellerID;
    }

    public String getBuyerID() {
        return BuyerID;
    }

    public Date getDate() {
        return date;
    }
}
