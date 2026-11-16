
package pl.wsb.foodloop.reservation.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;

    @Column(name = "customer_email", nullable = false, length = 120)
    private String customerEmail;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "reservation_date", nullable = false)
    private LocalDateTime reservationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ReservationStatus status;

    protected Reservation() {
    }

    public Reservation(String customerName, String customerEmail,
                       Integer quantity, LocalDateTime reservationDate,
                       ReservationStatus status) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.quantity = quantity;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}
