package com.redhat.bankdemo.model;

import java.io.Serializable;

public class CustomerRef implements Serializable {

    private static final long serialVersionUID = -4797252086153559990L;

    private Long customerId;

    public CustomerRef() {
    }

    public CustomerRef(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerRef [customerId=" + customerId + "]";
    }

}
