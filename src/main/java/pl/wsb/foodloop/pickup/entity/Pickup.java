
package pl.wsb.foodloop.pickup.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pickup")
public class Pickup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pickup_date", nullable = false)
    private LocalDateTime pickupDate;

    @Column(name = "pickup_code", nullable = false, unique = true, length = 20)
    private String pickupCode;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;

    @Column(name = "confirmed", nullable = false)
    private Boolean confirmed;

    @Embedded
    private Address address;

    protected Pickup() {
    }

    public Pickup(LocalDateTime pickupDate, String pickupCode,
                  String customerName, Boolean confirmed, Address address) {
        this.pickupDate = pickupDate;
        this.pickupCode = pickupCode;
        this.customerName = customerName;
        this.confirmed = confirmed;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public String getPickupCode() {
        return pickupCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public Address getAddress() {
        return address;
    }
}
