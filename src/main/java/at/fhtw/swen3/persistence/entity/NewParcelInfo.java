package at.fhtw.swen3.persistence.entity;

import javax.validation.constraints.Pattern;

public class NewParcelInfo {
    @Pattern(regexp="^[A-Z0-9]{9}$")
    private String trackingId = null;

    @Pattern(regexp="^[A-Z0-9]{9}$")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
}
