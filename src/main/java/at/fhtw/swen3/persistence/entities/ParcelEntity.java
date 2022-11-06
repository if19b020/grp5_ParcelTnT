package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
/*
* either all attributes from other classes (Parcel, NewParcelInfo, TrackingInformation (deleted))
* or class that has all other classes
* */
@Getter
@Setter
public class ParcelEntity {

    public enum StateEnum {
        PICKUP("Pickup"),

        INTRANSPORT("InTransport"),

        INTRUCKDELIVERY("InTruckDelivery"),

        TRANSFERRED("Transferred"),

        DELIVERED("Delivered");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }
    }

    @Min(value = 1, message = "Weight must be greater than 0")
    private Float weight = null;
    @NotNull
    private RecipientEntity recipient = null;
    @NotNull
    private RecipientEntity sender = null;

    @Pattern(regexp="^[A-Z0-9]{9}$")
    private String trackingId = null;

    private StateEnum state = null;
    private List<HopArrivalEntity> visitedHops = new ArrayList<HopArrivalEntity>();
    private List<HopArrivalEntity> futureHops = new ArrayList<HopArrivalEntity>();
}
