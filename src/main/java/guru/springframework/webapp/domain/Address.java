package guru.springframework.webapp.domain;

public class Address {
    String addressLine;
    String state;
    String city;
    int zip;


    public Address() {
    }

    public Address(String addressLine, String state, String city, int zip) {
        this.addressLine = addressLine;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
