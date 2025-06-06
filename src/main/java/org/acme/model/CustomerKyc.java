package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CustomerKyc extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @Column(name = "status",nullable = false)
    private boolean status;

    public CustomerKyc() {
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
