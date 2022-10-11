package at.fhtw.swen3.services.dto;

import at.fhtw.swen3.persistence.Recipient;

public class ParcelDto {
    private Float weight = null;
    private Recipient recipient = null;
    private Recipient sender = null;

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Recipient getSender() {
        return sender;
    }

    public void setSender(Recipient sender) {
        this.sender = sender;
    }
}
