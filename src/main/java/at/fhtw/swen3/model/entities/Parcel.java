package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Parcel {

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

    private Float weight = null;
    private at.fhtw.swen3.persistence.entity.Recipient recipient = null;
    private Recipient sender = null;

    private String trackingId = null;

    private StateEnum state = null;
    private List<HopArrival> visitedHops = new ArrayList<HopArrival>();
    private List<HopArrival> futureHops = new ArrayList<HopArrival>();
}