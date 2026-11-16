package pl.wsb.foodloop.foodoffer.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "food_offer")
public class FoodOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "price", nullable = false, precision = 8, scale = 2)
    private BigDecimal price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "pickup_deadline", nullable = false)
    private LocalDateTime pickupDeadline;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OfferStatus status;

    protected FoodOffer() {
    }

    public FoodOffer(String name, String description, BigDecimal price, Integer quantity,
                     LocalDateTime pickupDeadline, OfferStatus status) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.pickupDeadline = pickupDeadline;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDateTime getPickupDeadline() {
        return pickupDeadline;
    }

    public OfferStatus getStatus() {
        return status;
    }
}
