package lvn_5_2307.btvn.bai2;

public class Address {
    String country;
    String city;
    String distric;
    String street;

    public Address(String country, String city, String distric, String street) {
        this.country = country;
        this.city = city;
        this.distric = distric;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getDistric() {
        return distric;
    }

    public String getStreet() {
        return street;
    }

    public String toString(){
        return country + " " + city + " " + distric + " " + street;
    }
}
