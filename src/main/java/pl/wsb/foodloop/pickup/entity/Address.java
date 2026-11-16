
package pl.wsb.foodloop.pickup.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class Address {

    @Column(name = "street", nullable = false, length = 120)
    private String street;

    @Column(name = "city", nullable = false, length = 60)
    private String city;

    @Column(name = "postal_code", nullable = false, length = 10)
    private String postalCode;

    @Column(name = "country", nullable = false, length = 60)
    private String country;

    protected Address() {
    }

    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }
}
