package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;


@Getter
@Setter
//@Entity
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

    //@Column
    private Float weight = null;
    //@OneToOne
    //@JoinColumn(name = "recipient_name")
    private RecipientEntity recipient = null;
    //@OneToOne
    //@JoinColumn(name = "sender_name")
    private RecipientEntity sender = null;

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private String trackingId = null;

    //@Column
    private StateEnum state = null;
    //private List<HopArrival> visitedHops = new ArrayList<HopArrival>();
    //private List<HopArrival> futureHops = new ArrayList<HopArrival>();
}