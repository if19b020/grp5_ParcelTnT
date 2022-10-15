package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.RecipientDto;

public class Parcel {
    private Float weight = null;
    private RecipientDto recipient = null;
    private RecipientDto sender = null;

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public RecipientDto getRecipient() {
        return recipient;
    }

    public void setRecipient(RecipientDto recipient) {
        this.recipient = recipient;
    }

    public RecipientDto getSender() {
        return sender;
    }

    public void setSender(RecipientDto sender) {
        this.sender = sender;
    }
}
