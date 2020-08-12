package lvn_10_1008.btvn;

public class Trader {
    private String TraderCode;
    private String PIN; //(Personal Identification Number)
    private String Address;
    private String Email;
    private String Tel;

    public Trader(String traderCode, String PIN, String address, String email, String tel) {
        TraderCode = traderCode;
        this.PIN = PIN;
        Address = address;
        Email = email;
        Tel = tel;
    }

    public String getTraderCode() {
        return TraderCode;
    }

    public String getPIN() {
        return PIN;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public String getTel() {
        return Tel;
    }
}
