package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.RecipientDto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Parcel {
    @Min(value = 1, message = "Weight must be greater than 0")
    private Float weight = null;
    @NotNull
    private RecipientDto recipient = null;
    @NotNull
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
