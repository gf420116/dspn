package com.gf.dspn.stream;

public class SmsCustomerSendDetail {

    private int id;

    private String customerId;

    private int smsFee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getSmsFee() {
        return smsFee;
    }

    public void setSmsFee(int smsFee) {
        this.smsFee = smsFee;
    }
}
