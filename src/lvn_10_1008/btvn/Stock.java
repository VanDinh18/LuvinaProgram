package lvn_10_1008.btvn;

public class Stock {
    private String StockCode;
    private String Info;// Thông tin về Cty

    public Stock(String stockCode, String info) {
        StockCode = stockCode;
        Info = info;
    }

    public String getStockCode() {
        return StockCode;
    }

    public String getInfo() {
        return Info;
    }
}
